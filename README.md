# appium_automation

Project Overview:

This project is a test automation framework that uses Appium for mobile testing, Cucumber for behavior-driven development (BDD), and Maven for build automation and dependency management. The tests are written in Java, and this framework is designed for automating #Calculator mobile application (Android) with a focus on readable and maintainable tests.

Prerequisites:

Before running the tests, ensure that you have the following installed and set up on your system:

Java (JDK 11 or later)
Maven (3.0+)
Appium (Latest version)
Android Studio or Xcode (For Android/iOS emulators)
Cucumber (For BDD-style tests)
Appium Server (Running locally or remotely)

Setting Up Appium:

1. Install Appium globally via npm:
```
npm install -g appium
```

This will install the Appium server only, but no drivers. Install the latest versions of the XCUITest and UiAutomator2 drivers, after installing Appium you would run the following commands:
```
appium driver install uiautomator2
appium driver install xcuitest
```

Creating Android Virtual Device (Emulator) from Android Studio:
 
1) Open Android Studio.
2) Click on Tools -> AVD Manager -> Create Virtual Device -> Select the device and OS version -> Finish.
3) Once Virtual device is created, click on Launch this AVD in the emulator.
4) Command to view the list of devices attached `adb devices`

Running the Tests:

1. Build the Project:
Before running the tests, make sure the project is built and all dependencies are installed. Use the following Maven command to clean and install the project:
```
mvn clean install
```

2. Start Appium Server:

Make sure that your Appium server is running before executing the tests. You can start Appium from the terminal by running:
```
appium
```

3. Run the Cucumber Tests:

You can run the tests using Maven:
```
mvn test
```

Reporting:

Cucumber will generate HTML reports in the target folder after tests are executed.

