package com.company.test.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "TEST_CONSUMER")
@Entity(name = "test_Consumer")
public class Consumer extends StandardEntity {
    private static final long serialVersionUID = 6298554387846762331L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "METER_ID")
    protected Meter meter;

    @NotNull
    @Column(name = "STREET_NAME", nullable = false)
    protected String streetName;

    @NotNull
    @Column(name = "HOUSE_NUM", nullable = false, length = 3)
    protected String houseNum;

    @NotNull
    @Column(name = "APARTMENT_NUM", nullable = false, length = 3)
    protected String apartmentNum;

    public String getApartmentNum() {
        return apartmentNum;
    }

    public void setApartmentNum(String apartmentNum) {
        this.apartmentNum = apartmentNum;
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Meter getMeter() {
        return meter;
    }

    public void setMeter(Meter meter) {
        this.meter = meter;
    }

}