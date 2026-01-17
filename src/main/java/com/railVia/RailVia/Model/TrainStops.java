package com.railVia.RailVia.Model;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "train_stop")
public class TrainStops {

    @Id
    @Column(name = "stop_id")
    private Long stopId;

    @Column(name = "train_id")
    private Long trainId;

    @Column(name = "station_id")
    private Long stationId;

    @Column(name = "stop_sequence")
    private Integer stopSequence;

    @Column(name = "arrival_time")
    private LocalTime arrivalTime;

    @Column(name = "departure_time")
    private LocalTime departureTime;
}
