package com.alfa.work1;

public class Runner4 {

    public void run() {
        Device[] devices = new Device[3];

        devices[0]= new Monitor("123", "manufac1", 5654.0, 87, 89);
        devices[1] = new EthernetAdapter("123312", "Manuf3", 65465.0, 6565, "Maac1");
        devices[2] = new EthernetAdapter("123123", "Manuf3", 465.0, 6561235, "Maac2");

        for (Device d :
                devices) {
            System.out.println(d.toString());
        }
    }
}
