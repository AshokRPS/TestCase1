package page;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;


public class ParaBankBillPayPage {
	WebDriver webDriver = MyDriver.init();
	private static final Logger logger = LogManager.getLogger(ParaBankBillPayPage.class);

	public void ClickOnBillPayLink() {
		WebElement regButton = webDriver.findElement(By.xpath("//a[text()='Bill Pay']"));
		regButton.click();
		logger.info("Bill Pay Link Clicked Successfully");
	}

	public void setPayeeName(String payeeName) {
		WebElement ele = webDriver.findElement(By.xpath("//input[@ng-model='payee.name']"));
		ele.sendKeys(payeeName);
		logger.info("Payee Name Entered Successfully as : " + payeeName);
	}

	public void setPayeeAddress(String payeeAddress) {
		WebElement ele = webDriver.findElement(By.xpath("//input[@ng-model='payee.address.street']"));
		ele.sendKeys(payeeAddress);
		logger.info("Payee Address Entered Successfully as : " + payeeAddress);
	}

	public void setPayeeCity(String payeeCity) {
		WebElement ele = webDriver.findElement(By.xpath("//input[@ng-model='payee.address.city']"));
		ele.sendKeys(payeeCity);
		logger.info("Payee City Entered Successfully as : " + payeeCity);
	}
	public void setPayeeState(String payeeState) {
		WebElement ele = webDriver.findElement(By.xpath("//input[@ng-model='payee.address.state']"));
		ele.sendKeys(payeeState);
		logger.info("Payee State Entered Successfully as : " + payeeState);
	}
	public void setPayeeZipCode(String payeeZipCode) {
		WebElement ele = webDriver.findElement(By.xpath("//input[@ng-model='payee.address.zipCode']"));
		ele.sendKeys(payeeZipCode);
		logger.info("Payee ZipCode Entered Successfully as : " + payeeZipCode);
	}

	public void setPayeePhone(String payeePhone) {
		WebElement ele = webDriver.findElement(By.xpath("//input[@ng-model='payee.phoneNumber']"));
		ele.sendKeys(payeePhone);
		logger.info("Payee Phone Entered Successfully as : " + payeePhone);
	}

	public void setPayeeAccountNumber(String payeeAccountNumber) {
		WebElement ele = webDriver.findElement(By.xpath("//input[@ng-model='payee.accountNumber']"));
		ele.sendKeys(payeeAccountNumber);
		logger.info("Payee Account Number Entered Successfully as : " + payeeAccountNumber);
	}

	public void setPayeeVerifyAccountNumber(String payeeVerifyAccountNumber) {
		WebElement ele = webDriver.findElement(By.xpath("//input[@ng-model='verifyAccount']"));
		ele.sendKeys(payeeVerifyAccountNumber);
		logger.info("Payee VerifyAccountNumber Entered Successfully as : " + payeeVerifyAccountNumber);
	}

	public void setPayeeAmount(String payeeAmount) {
		WebElement ele = webDriver.findElement(By.xpath("//input[@ng-model='amount']"));
		ele.sendKeys(payeeAmount);
		logger.info("Payee Amount Entered Successfully as : " + payeeAmount);
	}

	public void clickSendPayment() {
		WebElement paymentButton = webDriver.findElement(By.xpath("//input[@type='submit']"));
		paymentButton.click();
		logger.info("Send Payment Button Clicked Successfully");
	}
}
