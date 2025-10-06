 OrangeHRM Automation Project

This project automates the core functionalities of the OrangeHRM demo website using Selenium WebDriver, Java, and Maven.  
It demonstrates complete end-to-end testing of a real-world web application with independent test scenarios.

Project Overview

The objective of this project is to automate common HR management workflows such as login, user creation, search, and deletion within the OrangeHRM system.

Application Under Test: 
https://opensource-demo.orangehrmlive.com/

Test Cases Implemented

| Test Case | Description | Key Concepts Covered |
| LoginTest | Logs into OrangeHRM with valid credentials | Element Locators, Explicit Waits |
| AddUserTest | Adds a new user with valid details | Dropdowns, Auto-Suggestions, Form Handling |
| SearchUserTest | Searches for an existing user | Web Tables, Loops, Text Extraction |
| DeleteUserTest | Deletes an existing user from the list | Alerts, Conditional Handling, Popups |

Technology Stack
1. Programming Language: Java  
2. Automation Tool: Selenium WebDriver  
3. Build Tool: Maven  
4. IDE: Eclipse  
5. Testing Type: Functional / UI Automation  

 Selenium Concepts Practiced
 
1.Locating elements using XPath, Name, and CSS Selectors  
2.Handling dropdowns and auto-suggestions  
3. Managing waits (Implicit and Explicit Waits)  
4.Working with alerts and confirmation popups  
5. Iterating through lists of WebElements  
6. Designing modular and independent test cases  

How to Run the Tests
1. Clone or download this repository.  
2. Open the project in Eclipse or IntelliJ IDEA.  
3. Verify all Maven dependencies are installed (`pom.xml`).  
4. Run each class individually using Run As → Java Application.


## Project Structure

