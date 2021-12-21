package com.example.FactoryDemo;

import org.springframework.stereotype.Component;

@Component
public class OnePlus {
    public void displayFeaturesOfOnePlusFeature(){
        System.out.println("==============Displaying features of oneplus============" +
                "\nDisplay 5.50-inch (1080x1920)\n" +
                "Processor Qualcomm Snapdragon 801.\n" +
                "Front Camera 5MP.\n" +
                "Rear Camera 13MP.\n" +
                "RAM 3GB.\n" +
                "Storage 16GB.\n" +
                "Battery Capacity 3100mAh.\n" +
                "OS CyanogenMod 11S.");
    }
}
