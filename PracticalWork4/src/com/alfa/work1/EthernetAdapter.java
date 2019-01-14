package com.alfa.work1;

public class EthernetAdapter extends Device {

    private int speed;
    private String mac;

    public EthernetAdapter(String serialNumber, String manufacture, double price, int speed, String mac) {
        super(serialNumber, manufacture, price);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", speed=" + speed +
                ", mac=" + mac;
    }
}
