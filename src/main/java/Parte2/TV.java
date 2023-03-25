package Parte2;

public class TV implements HDMI{
    @Override
    public void print(byte[] data) {
        System.out.println("+++++++++++TV++++++++++");
        String message=new String(data);
        System.out.println(message);
        System.out.println("+++++++++++TV++++++++++");
    }
}
