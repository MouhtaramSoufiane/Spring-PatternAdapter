package Parte2;

public class UniteCentrale {
    private VGA vga;
    public int readData(){
        return 1000;
    }
    public void printData(String data){
        System.out.println("=============Centrale==========");
        vga.print(data);
        System.out.println("=============Centrale==========");
    }

    public void setVga(VGA vga) {
        this.vga = vga;
    }
}
