# Harel Travel Insurance Testing Project

This project contains automated end-to-end tests for the **Harel Group Digital Travel Insurance** web application.  
It is implemented in **Java 21** using **Selenium WebDriver** and **TestNG**, following the **Page Object Model (POM)** design pattern.  
The project includes **Allure Reports** for test visualization and is integrated with **GitHub Actions CI/CD** to run tests and publish reports automatically.

---
## Features
- Automated UI tests for the main purchase flow:
  - Open the travel insurance website
  - Select first-time purchase
  - Choose a destination
  - Select travel dates via Date Picker (7 days from today, return 30 days later)
  - Validate number of travel days
  - Proceed to passenger details
- **Reusable utilities** for browser setup, waits, verifications, and reporting
- **Cross-browser readiness** (Chrome by default, easily extendable)
- **Allure Reporting** for detailed test execution analysis
- **CI/CD with GitHub Actions**: tests are triggered on each push and results are published to **GitHub Pages**

---

## Tech Stack
- **Language:** Java 21  
- **Build Tool:** Maven  
- **Testing Framework:** TestNG  
- **Automation Framework:** Selenium WebDriver  
- **Reporting:** Allure Reports  
- **CI/CD:** GitHub Actions  
- **Design Pattern:** Page Object Model (POM)

---

## How to Run Tests Locally
Clone the repository:
  bash-script
   git clone https://github.com/<your-username>/HarelProject.git
   cd HarelProject
