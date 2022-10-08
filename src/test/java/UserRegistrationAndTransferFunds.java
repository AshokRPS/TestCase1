import java.io.*;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dto.ResponseDto;
import steps.*;


public class UserRegistrationAndTransferFunds {

	private static final ParaBankUserRegistrationSteps paraBankUserRegistrationSteps = new ParaBankUserRegistrationSteps();
	private static final ParaBankUserPayload paraBankUserPayload = new ParaBankUserPayload();
	private static final ParaBankBillPaySteps paraBankBillPaySteps = new ParaBankBillPaySteps();

	ResponseDto sender, receiver;

	@BeforeClass
	public void setLog4JProperties() throws IOException {
		Properties props = new Properties();
		props.load(new FileInputStream(new File("src\\main\\resources\\log4j.properties")));
		PropertyConfigurator.configure(props);
	}

	@Test(priority = 0)
	public void registerUsers() {
		sender = paraBankUserPayload.UserPayload();
		receiver = paraBankUserPayload.UserPayload();

		paraBankUserRegistrationSteps.registerUser(sender);
		paraBankUserRegistrationSteps.registerUser(receiver);
	}

	@Test(priority = 1)
	public void transferFunds() {
		paraBankBillPaySteps.EnterPayeeDetails(receiver);

	}
}