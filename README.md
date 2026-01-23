eShopQA - Automation Testing Portfolio
https://img.shields.io/badge/Java-11-orange
https://img.shields.io/badge/Selenium-4.14-green
https://img.shields.io/badge/TestNG-7.8-red
https://img.shields.io/badge/Maven-3.8-blue
https://img.shields.io/badge/License-MIT-lightgrey

A professional automation testing framework for e-commerce web applications demonstrating industry best practices in test automation.

📋 Overview
eShopQA is a comprehensive automation testing framework built with Java, Selenium WebDriver, and TestNG. This portfolio project showcases modern test automation practices including the Page Object Model design pattern, data-driven testing, and robust test execution.

✨ Key Features
Page Object Model design pattern for maintainable test scripts

Thread-safe WebDriver management for parallel execution

Data-driven testing with JSON and properties files

Custom utility classes for common operations

Professional reporting with TestNG

Easy to extend and maintain

🏗️ Architecture
Project Structure
text
eShopQA/
├── src/main/java/
│   ├── Pages/
│   │   ├── HomePage.java          # Home page interactions
│   │   └── LoginPage.java         # Login page interactions
│   └── utils/
│       ├── DriverFactory.java     # Thread-safe WebDriver management
│       └── WaitUtils.java         # Custom wait utilities
├── src/test/java/tests/
│   ├── BaseTest.java              # Base test class with setup/teardown
│   ├── HomePageTest.java          # Home page test cases
│   └── LoginTest.java             # Login functionality tests
├── src/main/resources/
│   ├── config.properties          # Configuration settings
│   └── testData.json              # Test data in JSON format
├── README.md                      # Project documentation
├── pom.xml                        # Maven dependencies
└── .gitignore                     # Git ignore rules
Design Patterns
Page Object Model (POM): Each web page is represented as a Java class

Singleton Pattern: DriverFactory uses ThreadLocal for thread safety

Base Test Class: Common test setup and teardown logic

Utility Classes: Reusable helper methods

🚀 Getting Started
Prerequisites
Java JDK 11 or higher

Maven 3.8+

Chrome Browser (latest version)

Git

Installation
Clone the repository

bash
git clone https://github.com/yourusername/eShopQA.git
cd eShopQA
Install dependencies

bash
mvn clean compile
Download WebDriver

ChromeDriver is automatically managed via WebDriverManager

Ensure Chrome browser is installed

Running Tests
Run all tests
bash
mvn test
Run specific test class
bash
mvn test -Dtest=LoginTest
Run tests with specific browser
bash
mvn test -Dbrowser=chrome
# or
mvn test -Dbrowser=firefox
Generate TestNG report
bash
mvn test
# Reports will be generated in: target/surefire-reports/