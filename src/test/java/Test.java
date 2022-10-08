import steps.ParaBankUserPayload;
import steps.ParaBankUserRegistrationSteps;


class TestCase1 {


	private static final ParaBankUserRegistrationSteps paraBankUserRegistrationSteps = new ParaBankUserRegistrationSteps();
	private static final ParaBankUserPayload paraBankUserPayload = new ParaBankUserPayload();

	public static void main(String[] args) {
		String senderUserName = paraBankUserRegistrationSteps.registerUser(paraBankUserPayload.UserPayload());
		String receptUserName = paraBankUserRegistrationSteps.registerUser(paraBankUserPayload.UserPayload());
	}
}