import dto.ResponseDto;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import steps.ParaBankUserRegistrationSteps;
import steps.Utils;


class TestCase1 {

    private static Response response;

    private static ParaBankUserRegistrationSteps paraBankUserRegistrationSteps = new ParaBankUserRegistrationSteps();

    public static void main(String[] args) {



        String url = "https://randomuser.me/api";

        RequestSpecification request = RestAssured.given();

        response = request.get(url);
        ResponseBody body = response.getBody();

        ResponseDto sender = body.as(ResponseDto.class);

        System.out.println(sender.getResults().get(0).getId().getName());

        response = request.get(url);
        body = response.getBody();

        ResponseDto recipient = body.as(ResponseDto.class);

        System.out.println(recipient.getResults().get(0).getId().getName());


        paraBankUserRegistrationSteps.registerUser(sender);
        paraBankUserRegistrationSteps.registerUser(recipient);
    }
}