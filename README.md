Prepare Appium Instance for Window 10
==========================================

To Start Automation with Appium, we have to follow couple of steps. First we have to make your system ready then we can start our journey with appium.

1. Download & Install JDK
2. Download & Install IntelliJ IDEA Community Version
3. Download & Install android studio Android SDK thourgh Android Studio
4. Download & Install LTS Node Js
5. Download & Install Vysor
6. Download & Install Appium Desktop Apps
7. Set environment variable(path) - Set JAVA_HOME & ANDROID_HOME
8. Check if node.js, npm & Android SDK are installed - node --version, npm --version, adb --version
9. Install appium with node.js - npm install -g appium
10. Check if appium is installed - appium -v
11. Plugin Device (turn on developer mode & USB debugging)
- Find build number under settings and tap 7 times on build number.
- Enter your pattern, PIN or password to enable the Developer options menu.
- The "Developer options" menu will now appear in your Settings menu.
- Turn On the "USB Debugging" option from "Developer Options"
12. Indentify appPackage & appActivityName Open the app in your device. and use the command - adb shell "dumpsys activity activities | grep mResumedActivity"
13. Create TestNG XML plugin install from Marketplace - File >> Settings >> plugin >> Marketplace >> search 'Create TestNG XML' & install

Create Java(Gradle) Project in IntelliJ IDEA for Appium
==========================================================
1. Create Java(Gradle) Project in IntelliJ IDEA
2. Add Gradle Dependencies
- Selenium
- Appium CLient
- TestNG
3. Desired Capabilities

Appium Inspector to Identify Elements
=========================================
1. Appium Inspector download & install
2. Configure Appium Desktop client & Appium Inspector
- Appium Desktop
    -Go to Appium Server GUI -> Advanced
        -Server address: localhost
        -Port: 4723
        -Allow CORP: yes 
  
  -Appium Inspector
    -Go to or Open Appium Inspector
        -Remote host: localhost
        -Port: 4723
        -Path: /wd/hub
        -Allow Unauthorized Certificates
  