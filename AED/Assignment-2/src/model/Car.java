/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author karpe.s@northeastern.edu
 */
public class Car {
    
    private int serialNumber;
    private int modelNumber;
    private boolean isAvailable;
    private String manufacturer;
    private LocalDate manufacturedDate;
    private int seatCapacity;
    private String usedByApp;
    private LocalDate lastUpdated;
    private String city;
    private LocalDate maintenanceCertExpDate;
    
    private static int count = 0;
    
    public Car() {
        count++;
        modelNumber = count;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getModelNumber() {
        return modelNumber;
    }
    
    @Override
    public String toString() {
        return String.valueOf(modelNumber);
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDate manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public String getUsedByApp() {
        return usedByApp;
    }

    public void setUsedByApp(String usedByApp) {
        this.usedByApp = usedByApp;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getMaintenanceCertExpDate() {
        return maintenanceCertExpDate;
    }

    public void setMaintenanceCertExpDate(LocalDate maintenanceCertExpDate) {
        this.maintenanceCertExpDate = maintenanceCertExpDate;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Car.count = count;
    }
    
}
