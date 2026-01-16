package com.railVia.RailVia.Services;

import io.micrometer.common.util.StringUtils;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import com.railVia.RailVia.Model.TrainDetails;

import java.util.logging.Logger;


@Service
public class FindTrainService {

    //this method will validate source and destination
    public void validate(String origin, String destination) throws BadRequestException {
        //this line will check those two fields are not empty
        if(StringUtils.isNotEmpty(origin) || StringUtils.isNotEmpty(destination)){
            throw new BadRequestException(" please enter both Origin and destination");

        }

        // fetch soutce and destiantion validate



    }

    public TrainDetails getTrain(TrainDetails trainDetails){
        //fetch train from database based on source and destination

        return trainDetails;
    }

    //this method will say if train is vaable or not
    public boolean isavaible(){
        return true;
    }
    //login-> otp- log(otp sent)> jwt(jwt token create)-> allow login log(suuccruy loggedin)
}
