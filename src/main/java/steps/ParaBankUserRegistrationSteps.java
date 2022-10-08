package steps;

import dto.ResponseDto;
import page.*;

public class ParaBankUserRegistrationSteps extends ParaBankUserRegisterPage{

    public void registerUser(ResponseDto user) {
        openPage();
        setFirstName(user.getResults().get(0).getName().getFirst());
        setLastName(user.getResults().get(0).getName().getLast());
        setAddress(user.getResults().get(0).getLocation().getStreet().getNumber()
                + ", " +user.getResults().get(0).getLocation().getStreet().getName());
        setCity(user.getResults().get(0).getLocation().getCity());
        setState(user.getResults().get(0).getLocation().getState());
        setZipCode(user.getResults().get(0).getLocation().getPostcode());
        setPhone(user.getResults().get(0).getPhone());
        setSsn(Utils.generateIntValueText(4));
        setUserName(user.getResults().get(0).getLogin().getUsername());
        setPassword(user.getResults().get(0).getLogin().getPassword());
        setConfirm(user.getResults().get(0).getLogin().getPassword());
        clickRegister();
//        if(....){
//            setUserName(user.getResults().get(0).getLogin().getUsername()+Utils.generateIntValueText(4));
//            clickRegister();
//        }

    }
}
