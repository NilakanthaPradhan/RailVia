package com.railVia.RailVia.Model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Stations {
	
	private String stationName;
	private String stationCode;
	private TrainDetails train;

}
