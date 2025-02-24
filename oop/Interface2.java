class Printer{
    String company = "LG";

    public void getPrinter(){
        System.out.println("COMPANY - "+company);
    }
}

interface Printable{
    public void getPrintableData(String material,String inkColor);
}

class LaserPrinter extends Printer implements Printable{
    int price = 6999;
    public void getLaserPrinter(){
        System.out.println("PRICE - "+price);
    }
    public void getPrintableData(String material,String inkColor){
        System.out.println("MATERIAL  - "+material);
        System.out.println("INK COLOR - "+inkColor);
    }
}

class InkjetPrinter extends Printer implements Printable{
    int price = 16999;
    public void getInkjetPrinter(){
        System.out.println("PRICE - "+price);
    }
    public void getPrintableData(String material,String inkColor){
        System.out.println("MATERIAL  - "+material);
        System.out.println("INK COLOR - "+inkColor);
    }
}

public class Interface2 {
    public static void main(String[] args) {
        LaserPrinter lr = new LaserPrinter();
        lr.getPrinter();
        lr.getLaserPrinter();
        lr.getPrintableData("Black Toner Powder","Black");
        System.out.println("_____________________________");

        InkjetPrinter ip = new InkjetPrinter();
        ip.getPrinter();
        ip.getInkjetPrinter();
        ip.getPrintableData("RGB Liquid Ink","Multi color");
        System.out.println("_____________________________");
    }
}
