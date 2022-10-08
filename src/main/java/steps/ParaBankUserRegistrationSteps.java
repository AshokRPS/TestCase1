package steps;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import dto.ResponseDto;
import page.ParaBankUserRegisterPage;


public class ParaBankUserRegistrationSteps extends ParaBankUserRegisterPage {
	private static final Logger logger = LogManager.getLogger(ParaBankUserRegistrationSteps.class);
	String address,city,state,zipCode,phone,userName;

	public void registerUser(ResponseDto user) {
		userName = user.getResults().get(0).getLogin().getUsername();
		address = user.getResults().get(0).getLocation().getStreet().getNumber() + ", " + user.getResults().get(
				0).getLocation().getStreet().getName();
		city = user.getResults().get(0).getLocation().getCity();
		state = user.getResults().get(0).getLocation().getState();
		zipCode = user.getResults().get(0).getLocation().getPostcode();
		phone = user.getResults().get(0).getPhone();


		logger.info("Launch ParaBank Registration URL");
		openPage();

		logger.info("Enter User's First Name");
		setFirstName(user.getResults().get(0).getName().getFirst());

		logger.info("Enter User's Last Name");
		setLastName(user.getResults().get(0).getName().getLast());

		logger.info("Enter User's Address");
		setAddress(user.getResults().get(0).getLocation().getStreet().getNumber() + ", " + user.getResults().get(
				0).getLocation().getStreet().getName());

		logger.info("Enter User's City");
		setCity(user.getResults().get(0).getLocation().getCity());

		logger.info("Enter User's State");
		setState(user.getResults().get(0).getLocation().getState());

		logger.info("Enter User's PostCode");
		setZipCode(user.getResults().get(0).getLocation().getPostcode());
		
		logger.info("Enter User's Phone Number");
		setPhone(user.getResults().get(0).getPhone());

		logger.info("Enter User's SSN");
		setSsn(Utils.generateIntValueText(4));

		logger.info("Enter User's UserName");
		setUserName(userName);

		logger.info("Enter User's Password");
		setPassword(user.getResults().get(0).getLogin().getPassword());

		logger.info("Confirm Password");
		setConfirm(user.getResults().get(0).getLogin().getPassword());

		logger.info("Click on Register User Button");
		clickRegister();

		if (checkUserNameError()) {
			userName = userName + Utils.generateIntValueText(4);
			logger.info("Enter Different User Name");
			setUserName(userName);

			logger.info("Enter Different Password");
			setPassword(user.getResults().get(0).getLogin().getPassword());

			logger.info("Enter Different Password");
			setConfirm(user.getResults().get(0).getLogin().getPassword());
			clickRegister();
		} else {
			checkSuccessfullMessage();
		}
	}
}
