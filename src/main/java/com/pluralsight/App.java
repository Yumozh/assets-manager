package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Asset> assetsList = new ArrayList<>();
        assetsList.add(new House(
                "Regular House",
                "2023-10-15",
                450000.00,
                "123 Maple St",
                2,
                2500,
                500
        ));
        assetsList.add(new House(
                "Vacation House",
                "2024-05-20",
                1250000.00,
                "742 Evergreen Ter",
                1,
                4200,
                15000
        ));
        assetsList.add(new Vehicle(
                "Primary Commuter Car",
                "2022-03-10",
                28500.00,
                "Toyota Camry",
                2021,
                35000
        ));
        assetsList.add(new Vehicle(
                "Vintage Weekend Cruiser",
                "2024-01-15",
                55000.00,
                "Ford Mustang",
                1967,
                82000
        ));

        String message = " ";

        for(Asset asset : assetsList){
            if(asset instanceof House){

                House house = (House) asset;

                message = house.getDescription() + "\n" +
                        "House at " + house.getAddress() + "\n" +
                        "Acquire Date " + house.getDateAcquired() + "\n" +
                         "Current Value " + house.getValue() + "\n";
                }
            if(asset instanceof Vehicle){

                Vehicle vehicle = (Vehicle) asset;

                message = vehicle.getDescription() + "\n" +
                        "Year " + vehicle.getYear() + "\n" +
                        "Acquire Date " + vehicle.getDateAcquired() + "\n" +
                        "Make " + vehicle.getMakeModel() + "\n" +
                        "Current Value " + vehicle.getValue() + "\n";
            }
            }
        System.out.println(message);
    }
}
