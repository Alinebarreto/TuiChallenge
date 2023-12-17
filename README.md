# TuiChallenge

Project Setup Guide
This guide will walk you through the setup process for Appium automation testing with Java, Maven, and Eclipse on Windows.

Prerequisites
Ensure you have the following installed on your system:

Java JDK 11:

Download and install Java JDK 11: Download Here
Android Studio:

Download Android Studio and note the Android SDK path. Ensure that the APK runs on devices with API levels below 30 (for compatibility with older devices): Download Here
Node:

Download and install Node: Download Here
System Variables Configuration
Set (Java, Android SDK, and Node) Home Paths in Windows System variables.
Android Studio Configuration
Open Android Studio and configure the emulator for testing.
Appium Server Setup
Install and start the Appium Server via Node:

bash
Copy code
npm install -g appium@next
Install the uiautomator2 driver in the terminal:

bash
Copy code
appium driver list
appium driver install uiautomator2
Eclipse IDE Setup
Install Eclipse IDE for Java Developers: Download Here

Create a new Maven project using the maven-archetype-quickstart.

In Eclipse, include the following dependencies in the pom.xml file:

Appium Java Client 9.0.0:

xml
Copy code
<dependency>
    <groupId>io.appium</groupId>
    <artifactId>java-client</artifactId>
    <version>9.0.0</version>
</dependency>
More Info

TestNG 7.8.0:

xml
Copy code
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.8.0</version>
</dependency>
More Info

Cucumber TestNG 7.15.0:

xml
Copy code
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-testng</artifactId>
    <version>7.15.0</version>
</dependency>
More Info

Conclusion
Your development environment is now set up for Appium automation testing. Customize your Maven project, write test scripts, and run them on the configured emulator.
