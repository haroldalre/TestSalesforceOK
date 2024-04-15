Salesforce Automation Script 

This Java program is designed to automate certain tasks in Salesforce using the Selenium WebDriver library. The primary purpose of this script (src/main/java/com/gapplabs/App.java) is to log into a Salesforce account, create a new account, and modify its details.

Prerequisites

- Install the ChromeDriver executable and set the webdriver.chrome.driver system property accordingly.
- Replace the username and password in the script with your actual Salesforce credentials.

Code Overview

- Import necessary libraries: The program imports the required libraries for Selenium WebDriver and the ChromeDriver.
- Initialize the ChromeDriver: The ChromeDriver is initialized to interact with the Chrome browser.
- Navigate to Salesforce: The program navigates to the Salesforce login page using the driver.get() method.
- Enter username and password: The program enters the username and password in the corresponding fields using the sendKeys() method.
- Click the login button: The program clicks the login button using the click() method.
- Wait for elements to be clickable: The program uses WebDriverWait to wait for specific elements to be clickable before interacting with them. This ensures that the script runs efficiently and reliably.
- Create a new account: The program creates a new account by clicking the "New" button, entering the account details, and clicking the "Save" button.
- Modify the account: The program modifies the account by clicking the "Modify" button, entering the new phone number, and clicking the "Save" button.
