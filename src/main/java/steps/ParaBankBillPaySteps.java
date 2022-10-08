package steps;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import dto.ResponseDto;
import page.ParaBankBillPayPage;



public class ParaBankBillPaySteps extends ParaBankBillPayPage {
	private static final Logger logger = LogManager.getLogger(ParaBankBillPaySteps.class);
	String address;
	String city;
	String state;
	String zipCode;
	String phone;
	String userName;

	public void EnterPayeeDetails(ResponseDto user) {
		userName = user.getResults().get(0).getLogin().getUsername();
		address = user.getResults().get(0).getLocation().getStreet().getNumber() + ", " + user.getResults().get(
				0).getLocation().getStreet().getName();
		city = user.getResults().get(0).getLocation().getCity();
		state = user.getResults().get(0).getLocation().getState();
		zipCode = user.getResults().get(0).getLocation().getPostcode();
		phone = user.getResults().get(0).getPhone();


		logger.info("Click on Bill Pay Link");
		ClickOnBillPayLink();

		logger.info("Enter Payee Name");
		setPayeeName(userName);

		logger.info("Enter Payee Address");
		setPayeeAddress(address);

		logger.info("Enter Payee City");
		setPayeeCity(city);

		logger.info("Enter Payee State");
		setPayeeState(state);

		logger.info("Enter Payee ZipCode");
		setPayeeZipCode(zipCode);

		logger.info("Enter Payee City");
		setPayeeAddress(city);

		logger.info("Enter Payee Phone");
		setPayeePhone(phone);

		logger.info("Enter Payee Account");
		String AccountNumber = Utils.generateIntValueText(5);
		setPayeeAccountNumber(AccountNumber);

		logger.info("Enter Payee Verify Account");
		setPayeeVerifyAccountNumber(AccountNumber);

		logger.info("Enter Payee Amount");
		setPayeeAmount(Utils.generateIntValueText(2));

		logger.info("Click on Send Payment Button");
		clickSendPayment();
	}
}
