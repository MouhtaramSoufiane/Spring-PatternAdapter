package Parte2;

public class Clavier implements USB{

    @Override
    public int read() {
        int touch=100;
        return touch;
    }
}
