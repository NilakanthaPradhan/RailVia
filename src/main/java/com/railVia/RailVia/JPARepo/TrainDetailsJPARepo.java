package com.railVia.RailVia.JPARepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.railVia.RailVia.Model.TrainDetails;

@Repository
public interface TrainDetailsJPARepo  extends JpaRepository<TrainDetails, String>{
	
	TrainDetailsJPARepo getByKey(String key);
	
	List<TrainDetails> getByOrigin(String origin);

}
