package com.alfa.work1;

public class Runner4 {

    public void run() {

        Device[] devices = new Device[3];
        devices[0] = new Monitor("123", "manufac1", 5654.0, 87, 89);
        devices[1] = new EthernetAdapter("123312", "Manuf3", 65465.0, 6565, "Maac1");
        devices[2] = new EthernetAdapter("123123", "Manuf3", 465.0, 6561235, "Maac2");
        for (Device d :
                devices) {
            System.out.println(d.toString());
        }
        Monitor monitor1 = new Monitor("123", "manufac1", 5654.0, 87, 89);
        Monitor monitor2 = new Monitor("1231", "manufac1", 5654.0, 87, 89);
        System.out.println("Does monitor 1 equal 2? " + monitor1.equals(monitor2));
        System.out.println("Does monitor 1 equal 1? " + monitor1.equals(monitor1));
        System.out.println("Does monitor 2 equal 2? " + monitor2.equals(monitor2));
        System.out.println("Hash code monitor 1 is " + monitor1.hashCode());
        System.out.println("Hash code monitor 2 is " + monitor2.hashCode());
        EthernetAdapter ad1 = new EthernetAdapter("123312", "Manuf3", 65465.0, 6565, "Maac1");
        EthernetAdapter ad2 = new EthernetAdapter("123312", "Manuf3", 65465.01, 6565, "Maac1");
        System.out.println("Does EthernetAdapter  1 equal 2? " + ad1.equals(ad2));
        System.out.println("Does EthernetAdapter  1 equal 1? " + ad1.equals(ad1));
        System.out.println("Does EthernetAdapter  2 equal 2? " + ad2.equals(ad2));
        System.out.println("Hash code EthernetAdapter 1 is " + ad1.hashCode());
        System.out.println("Hash code EthernetAdapter 2 is " + ad2.hashCode());

    }
}
