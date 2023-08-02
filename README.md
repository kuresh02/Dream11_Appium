# Dream11_Appium
Dream11 Android Mobile Application Automation - Team Creation
Introduction
This README file provides instructions on how to set up and execute Appium automation tests for the Dream11 Android mobile application. The automation script targets the team creation functionality within the app.

## Prerequisites
. Android Studio with Android SDK installed.
. Java Development Kit (JDK) installed.
. Appium Server installed and running.
. Android device or emulator configured and connected to Appium.
## Setup Instructions
Clone this repository to your local machine.
Import the project into your preferred Java IDE (e.g., Eclipse, IntelliJ) as a Maven project.Here i used Eclipse.
Install the required Java dependencies using Maven:
Download the Dream11 Android APK file and place it in the app directory of the project.
Update the desired capabilities in src/test/java/com/com.dream11.pro.TestCase/BaseClass.java to match your Android device or emulator specifications.
Make sure the Appium server is running before executing the tests.

## Running the Tests
Test Cases
The TeamCreationTest class contains test cases that simulate the team creation process in Dream11. The test cases cover scenarios such as selecting players, setting captain/vice-captain, verifying team points, and confirming the team creation.
