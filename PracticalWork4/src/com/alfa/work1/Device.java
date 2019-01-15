package com.alfa.work1;

import java.util.Objects;

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
        return "class " + this.getClass().getSimpleName() +
                ", serialNumber=" + serialNumber +
                ", manufacture=" + manufacture +
                ", price=" + price;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Device o = (Device) obj;
        return (this.price == o.price
                && this.manufacture.equals(o.manufacture)
                && this.serialNumber.equals(o.serialNumber));
    }

    @Override
    public int hashCode() {
        int res = 5;
        res = 31 * res + serialNumber.hashCode();
        res = 31 * res + manufacture.hashCode();
        res = 31 * res + (int) (Double.doubleToLongBits(price) ^ (Double.doubleToLongBits(price) >>> 32));
        return res;
    }

    public static void main(String[] args) {
        Device device = new Device("String1", "String", 1.0);
        Device device1 = new Device("String", "String", 1.0);
        System.out.println(device.equals(device1));
    }
    //        return Objects.hash(serialNumber, manufacture, price);
    //
    //    public int hashCode() {
    //    @Override
    //
    //    }
    //                Objects.equals(manufacture, device.manufacture);
    //                Objects.equals(serialNumber, device.serialNumber) &&
    //        return Double.compare(device.price, price) == 0 &&
    //        Device device = (Device) o;
    //        if (o == null || getClass() != o.getClass()) return false;
    //        if (this == o) return true;
    //    public boolean equals(Object o) {
//    @Override

//    }

}
