# TuiChallenge

# Project Setup Guide

## Prerequisites

Ensure you have the following installed on your system:

1. **Java JDK 11:**
   - Download and install [Java JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

2. **Android Studio:**
   - Download [Android Studio](https://developer.android.com/studio) and note the Android SDK path. Ensure that the APK runs on devices with API levels below 30 (for compatibility with older devices).

3. **Node:**
   - Download and install [Node](https://nodejs.org/)

## System Variables Configuration

1. Set (Java, Android SDK, and Node) Home Paths in Windows System variables.

## Android Studio Configuration

1. Open Android Studio and configure the emulator for testing.

## Appium Server Setup

1. Install and start the Appium Server via Node:
   ```bash
   npm install -g appium@next
## Install the uiautomator2 driver in the terminal:
appium driver list
appium driver install uiautomator2

# Eclipse IDE Setup

1. **Install Eclipse IDE for Java Developers**

2. **Create a new Maven project using the maven-archetype-quickstart.**

3. **In Eclipse, include the following dependencies in the pom.xml file:
https://mvnrepository.com/artifact/io.appium/java-client/9.0.0

Appium Java Client 9.0.0:**
   - <dependency>
    <groupId>io.appium</groupId>
    <artifactId>java-client</artifactId>
    <version>9.0.0</version>
</dependency>

4. **TestNG 7.8.0:**
https://mvnrepository.com/artifact/org.testng/testng/7.8.0

<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.8.0</version>
</dependency>


5. **Cucumber TestNG 7.15.0:**
https://mvnrepository.com/artifact/io.cucumber/cucumber-testng/7.15.0

<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-testng</artifactId>
    <version>7.15.0</version>
</dependency>

# Conclusion
Your development environment is now set up for Appium automation testing. Customize your Maven project, write test scripts, and run them on the configured emulator.



