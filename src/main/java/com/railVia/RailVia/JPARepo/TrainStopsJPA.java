package com.railVia.RailVia.JPARepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.railVia.RailVia.Model.TrainStops;

@Repository
public interface TrainStopsJPA  extends JpaRepository<TrainStops, Long> {

	    @Query(value = """
	        SELECT 
	            s.station_name AS stationName,
	            ts.arrival_time AS arrivalTime,
	            ts.departure_time AS departureTime
	        FROM train_stop ts
	        JOIN station s ON ts.station_id = s.station_id
	        WHERE ts.train_id = :trainId
	        ORDER BY ts.stop_sequence
	    """, nativeQuery = true)
	    List<TrainStops> findStopsByTrainId(@Param("trainId") Long trainId);
	}
