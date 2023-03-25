package Parte2;

public class Souris implements USB{
    @Override
    public int read() {
        int nombre=45;
        return nombre;
    }
}
