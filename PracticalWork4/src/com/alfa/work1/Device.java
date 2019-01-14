package com.alfa.work1;

public class Device {

    private String serialNumber;
    private String manufacture;
    private double price;

    public Device(String serialNumber, String manufacture, double price) {
        this.serialNumber = serialNumber;
        this.manufacture = manufacture;
        this.price = price;
    }

    public Device() {


    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Device{" +
                "serialNumber='" + serialNumber + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", price=" + price +
                '}';
    }
}
