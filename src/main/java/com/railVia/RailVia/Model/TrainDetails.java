package com.railVia.RailVia.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Time;
import java.time.LocalDate;

@Data
@Entity	
public class TrainDetails {

    @Id
    private String iD;
    private String origin;
    private String destination;
    private String via;
    private LocalDate journeyDate;
    private Time bufferTime;
    private String key;
}
