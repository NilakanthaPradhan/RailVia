package com.railVia.RailVia.Services;

import io.micrometer.common.util.StringUtils;
import jakarta.persistence.EntityNotFoundException;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railVia.RailVia.JPARepo.TrainDetailsJPARepo;
import com.railVia.RailVia.Model.TrainDetails;

import java.util.List;
import java.util.logging.Logger;


@Service
public class FindTrainService {
	
	@Autowired
	TrainDetailsJPARepo trainDetailsJPARepo;
	

    //this method will validate source and destination
    public void validate(String origin, String destination) throws BadRequestException {
        //this line will check those two fields are not empty
        if(StringUtils.isNotEmpty(origin) || StringUtils.isNotEmpty(destination)){
            throw new BadRequestException(" please enter both Origin and destination");

        }

        // fetch soutce and destiantion validate



    }

    public TrainDetails getTrain(TrainDetails trainDetails){
    	
    	for(TrainDetails eachtrain: isavaible(trainDetails.getOrigin())) {
    		
    		
    		eachtrain.
    	}
    	
    	
    	String key=trainDetails.getKey();
    	
    	trainDetailsJPARepo.getByKey(key);
        //fetch train from database based on source and destination

        return trainDetails;
    }

    //this method will say if train is vaable or not
    public List<TrainDetails> isavaible(String origin){
    	
    	List<TrainDetails> allTrains=trainDetailsJPARepo.getByOrigin(origin);
    	if(allTrains.isEmpty()) {
    		throw new EntityNotFoundException();
    	}
        return allTrains;
    }
    //login-> otp- log(otp sent)> jwt(jwt token create)-> allow login log(suuccruy loggedin)
}
