package com.pluralsight;

public class House extends Asset{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {

        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    @Override
    public double getValue() {
        double pricePerSqFt = 0;

        if(condition == 1){
            pricePerSqFt = 180.00;
        } else if (condition == 2) {
            pricePerSqFt = 130.00;
        } else if (condition == 3) {
            pricePerSqFt = 90.00;
        } else if (condition == 4) {
            pricePerSqFt = 80.00;
        }

        return (pricePerSqFt * squareFoot) + (lotSize * 0.25);
    }
}
