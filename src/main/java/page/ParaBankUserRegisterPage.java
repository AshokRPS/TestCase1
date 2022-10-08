package page;

import org.openqa.selenium.*;


public class ParaBankUserRegisterPage {

	WebDriver webDriver = MyDriver.init();
	String url = "https://parabank.parasoft.com/parabank/register.htm";

	public void openPage() {

		webDriver.get(url);
	}

	public void setFirstName(String firstName) {
		WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.firstName\"]"));
		ele.sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.lastName\"]"));
		ele.sendKeys(lastName);
	}

	public void setAddress(String address) {
		WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.address.street\"]"));
		ele.sendKeys(address);
	}

	public void setCity(String city) {
		WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.address.city\"]"));
		ele.sendKeys(city);
	}

	public void setState(String state) {
		WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.address.state\"]"));
		ele.sendKeys(state);
	}

	public void setZipCode(String zipCode) {
		WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]"));
		ele.sendKeys(zipCode);
	}

	public void setPhone(String phone) {
		WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]"));
		ele.sendKeys(phone);
	}

	public void setSsn(String ssn) {
		WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.ssn\"]"));
		ele.sendKeys(ssn);
	}

	public void setUserName(String userName) {
		WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.username\"]"));
		ele.sendKeys(userName);
	}

	public void setPassword(String password) {
		WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"customer.password\"]"));
		ele.sendKeys(password);
	}

	public void setConfirm(String confirmPassword) {
		WebElement ele = webDriver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]"));
		ele.sendKeys(confirmPassword);
	}

	public void clickRegister() {
		WebElement regButton = webDriver.findElement(By.xpath("//input[@value = 'Register']"));
		regButton.click();
	}

	public boolean checkUserNameError() {
		try {
			boolean userNameError = webDriver.findElement(
					By.xpath("//span[text()='This username already exists.']")).isDisplayed();
			if (userNameError) {
				return true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return false;
	}

	public boolean checkSuccessfullMessage() {
		try {
			boolean userCreated = webDriver.findElement(
					By.xpath("//p[text()='Your account was created successfully. You are now logged in.']")).isDisplayed();
			if (userCreated) {
				return true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return false;
	}

}

