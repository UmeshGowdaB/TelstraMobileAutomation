# TelstraMobileAutomation
Telstra Mobile Automation

Shopping Checkout regression test automation framework
=============

Introduction
-----

This is the test automation project for the Telstra team.

The framework is built with Appium to test the Amazon Shopping App.

Prerequisites
-------------
* Install Java 1.8
* Install [Gradle](https://gradle.org/install/)
* Install [Cucumber]

Framework structure
-------------
* Feature files: Feature files are written using Gherkin language based on the behavior-driven development (BDD) style of Given, When, Then. Cucumber-JVM consumes feature files to generate test code.
* Step definitions: Map gherkin lines to java methods. Call test in the step definitions.
* Page objects: Page objects are used to abstract the interactions between a user and a web page. Selenium is used to drive the browser.
* Yaml files: Yaml files can be used to manage test parameters, you can define the test environment URL, test data and message etc.

How to run tests
-----
We use gradle tasks to run tests. When running tests we need to pass environment variables as parameters.

`./gradlew clean runTests`

Options:

* `clean` - this cleans the build before running tests.
* `runTests` - this is the gradle task defined for running tests. The task also generates the report afterwards and archives it.
* `--info` - The log level for console.
After a run has finished, any failed scenarios are logged in a text file.

If you want to run only the failed tests then instead of using `runTests`, you can use `reRunFailedTests`.

Note - Run tests from root directory.

Pull requests
-----
Please create a pull request if you want to merge changes to master.
Do not push to master without an approved pull request.