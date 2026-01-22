package com.railVia.RailVia.JPARepo;

import com.railVia.RailVia.Model.TrainDetails;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Stations {
	
	private String stationName;
	private String stationCode;
	private TrainDetails train;

}
