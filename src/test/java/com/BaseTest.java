package com;

import com.smartpo.pom.util.General;
import io.appium.java_client.android.AndroidDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

public abstract class BaseTest {
    protected static AndroidDriver driver;
    protected abstract String getAppPackage();
    protected abstract String getAppActivity();

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities= new DesiredCapabilities();
        //Official device
//        capabilities.setCapability("appium:udid", "R9KR400X0QJ");
        //Virtual device
        capabilities.setCapability("appium:udid", "192.168.116.102:5555");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "10");
        capabilities.setCapability("appium:appPackage", getAppPackage());
//        capabilities.setCapability("appium:appPackage", "com.bracits.smartpo.training");
        capabilities.setCapability("appium:appActivity", getAppActivity());
//        capabilities.setCapability("appium:appActivity", "com.bracits.smartpo.po.ProgramOrganizerActivity");
        capabilities.setCapability("appium:noReset", "true");
        capabilities.setCapability("appium:fullReset", "false");

        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(General.TIME_WAIT));

        //Start Video Recording
        driver.startRecordingScreen();

    }


    @AfterClass
    public void tearDown(){
        stopRecording();
        driver.quit();
    }

    private void stopRecording() {
        String projectHomeDirectory = System.getProperty("user.dir");
        String base64String = driver.stopRecordingScreen();
        byte[] data = Base64.decodeBase64(base64String);
        String destinationPath = projectHomeDirectory + "/build/videos";
        File theDir = new File(destinationPath);
        if (!theDir.exists()) {
            theDir.mkdirs();
        }

        String filePath = destinationPath + "/" + driver.getDeviceTime().replace(":", "_").replace("+", " ") + ".mp4";
        System.out.println("filePath : " + filePath);
        Path path = Paths.get(filePath);
        try {
            Files.write(path, data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void takeScreenshot() {
        try {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String currentDir = System.getProperty("user.dir") + "/build/screenshots/";
            FileUtils.copyFile(scrFile, new File(currentDir + System.currentTimeMillis() + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
