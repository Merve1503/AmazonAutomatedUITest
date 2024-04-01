# Amazon Automated UI Testing Report

## Overview
This report presents the details of the automated UI testing conducted on the Amazon website. The testing process involved the use of Java programming language along with Selenium and JUnit libraries. Intellij IDEA IDE was utilized as the development environment for this testing endeavor.

## Tools and Libraries Used

Java: Java served as the primary programming language for scripting test scenarios and executing them.
Selenium: Selenium WebDriver was employed for automating web browsers to conduct UI tests. It facilitated interactions with web elements and navigation across the Amazon website.
JUnit: JUnit framework was utilized for organizing and executing the test cases. It provided annotations and assertions to streamline the testing process and validate expected outcomes.
Intellij IDEA: Intellij IDEA served as the integrated development environment for writing, debugging, and managing the test codebase.

## Test Scenarios
The following test scenarios were executed during the testing process:

Homepage Verification: Ensure the Amazon homepage loads successfully without errors.
Search a Product: Perform a search for a specific product and verify the search functionality.
Select a Product: Navigate to the product page and verify the product details.
Add Product to Cart: Add the selected product to the shopping cart and verify the addition process.
Go to Cart: Navigate to the shopping cart page and verify if the product is successfully added.

## Test Results

| Test Description     | Result     | Comments     |
|------------|-------------|-------------|
| Homepage Verification | Passed | The Amazon homepage loaded successfully. |
| The Amazon homepage loaded successfully. | Passed | The product search functionality worked as expected.|
| Select a Product | Passed | The selected product details were displayed correctly.|
| Add Product to Cart | Passed | The product was successfully added to the shopping cart.|
| Go to Cart | Passed | The user was navigated to the shopping cart page successfully.|

## Test Structure
The test codebase was structured as follows:

Test Classes: Each test scenario was encapsulated within a separate test class, utilizing JUnit annotations for setup, execution, and assertions.
Page Objects: Page object model (POM) design pattern was employed to represent web pages as Java classes. These classes encapsulated the page elements and methods to interact with them, promoting code reusability and maintainability.
Test Data: Test data, such as URLs, input values, and expected outcomes, were managed within separate data files or constants to facilitate easy modification and maintenance.

## Conclusion
The automated UI testing process for the Amazon website was successfully conducted, ensuring the functionality and reliability of key features and functionalities. The use of Java, Selenium, and JUnit facilitated efficient test automation, while the structured test codebase enabled easy maintenance and scalability.

This report provides insights into the tools, methodologies, and outcomes of the automated UI testing process conducted on the Amazon website.
