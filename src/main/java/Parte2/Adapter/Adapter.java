package Parte2.Adapter;

import Parte2.HDMI;
import Parte2.VGA;

public class Adapter implements VGA {
    private HDMI hdmi;
    @Override
    public void print(String message) {
        System.out.println("________Adapter_________");
        hdmi.print(message.getBytes());
        System.out.println("________Adapter_________");

    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}
