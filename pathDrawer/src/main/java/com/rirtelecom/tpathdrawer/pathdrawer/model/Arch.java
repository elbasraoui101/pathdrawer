package com.rirtelecom.tpathdrawer.pathdrawer.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "arch_1004901")
public class Arch {

    @Id
    @Column(name = "tram_id")
    private Integer id;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "id_device")
    private Integer deviceId;

    @Column(name = "speed")
    private Integer speed;

    @Column(name = "fuel")
    private Integer fuel;

    @Column(name = "temp")
    private String temp;

    @Column(name = "X")
    private Integer x;

    @Column(name = "Y")
    private Integer y;

    @Column(name = "Z")
    private Integer z;

    @Column(name = "ignition")
    private Boolean ignition;

    @Column(name = "rpm")
    private Integer rpm;

    @Column(name = "fuel_rate")
    private Double fuelRate;

    @Column(name = "tfu")
    private Double tfu;

    @Column(name = "odo")
    private Double odo;

    @Column(name = "SatInView")
    private Integer satInView;

    @Column(name = "signal")
    private Integer signal;

    @Column(name = "heading")
    private Integer heading;

    @Column(name = "charger")
    private Boolean charger;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "state")
    private Boolean state;

    @Column(name = "validity")
    private Boolean validity;

    @Column(name = "temp_engine")
    private Integer engineTemp;

    @Column(name = "accum_odo")
    private Float accumulatedOdo;

    @Column(name = "do1")
    private Integer do1;

    @Column(name = "do2")
    private Integer do2;

    @Column(name = "do3")
    private Integer do3;

    @Column(name = "do4")
    private Integer do4;

    @Column(name = "di1")
    private Integer di1;

    @Column(name = "di2")
    private Integer di2;

    @Column(name = "di3")
    private Integer di3;

    @Column(name = "di4")
    private Integer di4;

    @Column(name = "an1")
    private Integer an1;

    @Column(name = "an2")
    private Integer an2;

    @Column(name = "an3")
    private Integer an3;

    @Column(name = "an4")
    private Integer an4;

}
