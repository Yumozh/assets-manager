package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    @Override
    public double getValue() {
        int yearNow = LocalDate.now().getYear();
        int age = yearNow - year;
        double reducedValue;

        if(age <= 3) {
            reducedValue = getValue() * Math.pow(0.97, age);
        } else if (age <= 6) {
            reducedValue = getValue() * Math.pow(0.94, age);
        } else if (age <= 10) {
            reducedValue = getValue() * Math.pow(0.92, age);
        }else{
            reducedValue = 1000;
        }
        if(odometer > 100_000){
            if(!(makeModel.equalsIgnoreCase("Honda") || makeModel.equalsIgnoreCase("Toyota"))){
                reducedValue = reducedValue * 0.75;
            }
        }
        return reducedValue;
    }
}
