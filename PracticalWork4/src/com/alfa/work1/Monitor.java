package com.alfa.work1;

public class Monitor extends Device {

    private int resolutionX;
    private int resolutionY;

    public Monitor(String serialNumber, String manufacture, double price, int resolutionX, int resolutionY) {
        super(serialNumber, manufacture, price);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", X=" + resolutionX +
                ", Y=" + resolutionY;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        //if (obj == null || this.getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Monitor that = (Monitor) obj;
        return (this.resolutionX == that.resolutionX
                && this.resolutionY == that.resolutionY);
    }

    @Override
    public int hashCode() {

        return 31 * 5 + resolutionY + resolutionX + super.hashCode();
    }

}
