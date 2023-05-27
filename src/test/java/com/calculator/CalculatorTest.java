package com.calculator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseCalculatorTest{

    @Test
    public void addNumbersShouldSucceed(){
        driver.findElement(By.id("pad_btn_b_b")).click();
        driver.findElement(By.id("pad_img_d_d")).click();
        driver.findElement(By.id("pad_btn_b_c")).click();
        driver.findElement(By.id("pad_img_e_d")).click();
        Assert.assertEquals("17", driver.findElement(By.id("lay_normal_body_val")).getText().trim());
    }

    @Test
    public void subtractNumbersShouldSucceed(){
        driver.findElement(By.id("pad_btn_b_b")).click();
        driver.findElement(By.id("pad_img_c_d")).click();
        driver.findElement(By.id("pad_btn_c_a")).click();
        driver.findElement(By.id("pad_img_e_d")).click();
        Assert.assertEquals("4", driver.findElement(By.id("lay_normal_body_val")).getText().trim());

    }

    @Test
    public void multiplyNumbersShouldSucceed(){
        driver.findElement(By.id("pad_btn_b_b")).click();
        driver.findElement(By.id("pad_img_b_d")).click();
        driver.findElement(By.id("pad_btn_c_a")).click();
        driver.findElement(By.id("pad_img_e_d")).click();
        Assert.assertEquals("32", driver.findElement(By.id("lay_normal_body_val")).getText().trim());

    }

    @Test
    public void divideNumbersShouldSucceed(){
        driver.findElement(By.id("pad_btn_b_b")).click();
        driver.findElement(By.id("pad_img_a_d")).click();
        driver.findElement(By.id("pad_btn_c_a")).click();
        driver.findElement(By.id("pad_img_e_d")).click();
        Assert.assertEquals("2", driver.findElement(By.id("lay_normal_body_val")).getText().trim());

    }

    @Test
    public void modulasNumbersShouldSucceed(){
        driver.findElement(By.id("pad_btn_b_b")).click();
        driver.findElement(By.id("pad_img_a_c")).click();
        driver.findElement(By.id("pad_btn_c_a")).click();
        driver.findElement(By.id("pad_img_e_d")).click();
    }

}
