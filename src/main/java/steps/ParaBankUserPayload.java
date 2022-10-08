package steps;

import dto.ResponseDto;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;


public class ParaBankUserPayload {
	public ResponseDto UserPayload() {
		Response response;
		ResponseBody body;
		String url = "https://randomuser.me/api";
		RequestSpecification request = RestAssured.given();
		response = request.get(url);
		body = response.getBody();
		return body.as(ResponseDto.class);
	}
}

