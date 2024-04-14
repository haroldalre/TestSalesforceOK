package com.gapplabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harold\\Desktop\\InstallationProject\\Project2\\Salesforce\\target\\chromedriver-win64\\chromedriver.exe");

        //Initialize browser
        WebDriver driver = new ChromeDriver();

        //Open Salesforce
        driver.get("https://saas-customer-3840.my.salesforce.com/");

        //Maximize browser
        driver.manage().window().maximize();

        //Enter username
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("haroldalre-3h2a@force.com");

        //Enter password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("96111712007Haro.");

        //Click the login button
        WebElement loginButton = driver.findElement(By.id("Login"));
        loginButton.click();

        // Wait for the "New" button to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Nuevo']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='slds-input'])[2]"))).sendKeys("Test cuenta");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='slds-input'])[3]"))).sendKeys("www.cuenta.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='slds-button slds-button_brand' and text()='Guardar']"))).click();

        // Click on the "Modify" button to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"brandBand_2\"]/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-account_-record_-page___-account___-v-i-e-w/forcegenerated-flexipage_account_record_page_account__view_js/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-pinned-header-template-desktop2/div/flexipage-pinned-header/slot/slot/flexipage-component2/slot/records-lwc-highlights-panel/records-lwc-record-layout/forcegenerated-highlightspanel_account___012000000000000aaa___compact___view___recordlayout2/records-highlights2/div[1]/div/div[3]/div/runtime_platform_actions-actions-ribbon/ul/li[3]/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-page-reference/slot/slot/lightning-button/button"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='slds-input'])[4]"))).sendKeys("+573172283506");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='slds-button slds-button_brand' and text()='Guardar']"))).click();
         }
}