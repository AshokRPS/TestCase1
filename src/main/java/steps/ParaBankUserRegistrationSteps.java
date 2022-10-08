package steps;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import dto.ResponseDto;
import page.ParaBankUserRegisterPage;


public class ParaBankUserRegistrationSteps extends ParaBankUserRegisterPage {
	private static final Logger logger = LogManager.getLogger(ParaBankUserRegistrationSteps.class);

	public String registerUser(ResponseDto user) {
		String userName = user.getResults().get(0).getLogin().getUsername();

		logger.trace("Launch ParaBank UI");
		openPage();

		setFirstName(user.getResults().get(0).getName().getFirst());
		setLastName(user.getResults().get(0).getName().getLast());
		setAddress(user.getResults().get(0).getLocation().getStreet().getNumber() + ", " + user.getResults().get(
				0).getLocation().getStreet().getName());
		setCity(user.getResults().get(0).getLocation().getCity());
		setState(user.getResults().get(0).getLocation().getState());
		setZipCode(user.getResults().get(0).getLocation().getPostcode());
		setPhone(user.getResults().get(0).getPhone());
		setSsn(Utils.generateIntValueText(4));
		setUserName(userName);
		setPassword(user.getResults().get(0).getLogin().getPassword());
		setConfirm(user.getResults().get(0).getLogin().getPassword());
		clickRegister();

		if (checkUserNameError()) {
			userName = userName + Utils.generateIntValueText(4);
			setUserName(userName);
			setPassword(user.getResults().get(0).getLogin().getPassword());
			setConfirm(user.getResults().get(0).getLogin().getPassword());
			clickRegister();
		} else {
			checkSuccessfullMessage();
		}
		return userName;
	}
}
