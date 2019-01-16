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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!super.equals(o)) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed == that.speed
                && this.mac.equals(that.mac);
    }

    @Override
    public int hashCode() {

        int result = 5;
        result = 31 * result + mac.hashCode();
        result = 31 * result + speed;
        return result + super.hashCode();
    }

}
