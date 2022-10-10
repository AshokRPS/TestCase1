package page;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ParaBankUserRegisterPage {

    WebDriver webDriver = MyDriver.init();
    String url = "https://parabank.parasoft.com/parabank/register.htm";
    private static final Logger logger = LogManager.getLogger(ParaBankUserRegisterPage.class);

    public void openPage() {
        webDriver.get(url);
        logger.info("URL Launch Successfully");
    }

    public void setFirstName(String firstName) {
        WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.firstName\"]"));
        ele.sendKeys(firstName);
        logger.info("First Name Entered Successfully as : " + firstName);
    }

    public void setLastName(String lastName) {
        WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.lastName\"]"));
        ele.sendKeys(lastName);
        logger.info("Last Name Entered Successfully as : " + lastName);
    }

    public void setAddress(String address) {
        WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.address.street\"]"));
        ele.sendKeys(address);
        logger.info("Address Entered Successfully as : " + address);
    }

    public void setCity(String city) {
        WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.address.city\"]"));
        ele.sendKeys(city);
        logger.info("City Entered Successfully as : " + city);
    }

    public void setState(String state) {
        WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.address.state\"]"));
        ele.sendKeys(state);
        logger.info("State Entered Successfully as : " + state);
    }

    public void setZipCode(String zipCode) {
        WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]"));
        ele.sendKeys(zipCode);
        logger.info("zipCode Entered Successfully as : " + zipCode);
    }

    public void setPhone(String phone) {
        WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]"));
        ele.sendKeys(phone);
        logger.info("Phone Entered Successfully as : " + phone);
    }

    public void setSsn(String ssn) {
        WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.ssn\"]"));
        ele.sendKeys(ssn);
        logger.info("SSN Entered Successfully as : " + ssn);
    }

    public void setUserName(String userName) {
        WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.username\"]"));
        ele.sendKeys(userName);
        logger.info("userName Entered Successfully as : " + userName);
    }

    public void setPassword(String password) {
        WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.password\"]"));
        ele.sendKeys(password);
        logger.info("Password Entered Successfully as : " + password);
    }

    public void setConfirm(String confirmPassword) {
        WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]"));
        ele.sendKeys(confirmPassword);
        logger.info("confirmPassword Entered Successfully as : " + confirmPassword);
    }

    public void clickRegister() {
        WebElement regButton = webDriver.findElement(By.xpath("//input[@value = 'Register']"));
        regButton.click();
        logger.info("Register Button Clicked Successfully");
    }

    public boolean checkUserNameError() {
        try {
            boolean userNameError = webDriver.findElement(
                    By.xpath("//span[text()='This username already exists.']")).isDisplayed();
            if (userNameError) {
                logger.info("User Name Already Existing, try with different user name");
                return true;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return false;
    }

    public void checkSuccessfullMessage() {
        try {
            boolean userCreated = webDriver.findElement(
                    By.xpath("//p[text()='Your account was created successfully. You are now logged in.']")).isDisplayed();
            if (userCreated) {
                String createdUserName = webDriver.findElement(By.xpath("//h1[@class='title']")).getText();
                logger.info("User Created Successfully is " + createdUserName.substring(8));
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

}

