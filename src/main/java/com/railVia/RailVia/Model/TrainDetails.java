package com.railVia.RailVia.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class TrainDetails {

    @Id
    private String iD;
    private String origin;
    private String destination;
    private LocalDate journeyDate;
    private LocalDateTime arrivalTime;
    private LocalDateTime departureTime;
}
