import java.util.Scanner;

class Watch {
    private String brand;
    private String watchType;
    private int price;

    public void setBrand(String b) {
        brand = b;
    }

    public String getBrand() {
        return brand;
    }

    public void setWatchType(String t) {
        watchType = t;
    }

    public String getWatchType() {
        return watchType;
    }

    public void setPrice(int p) {
        price = p;
    }

    public int getPrice() {
        return price;
    }
}

class Encapsulation {
    public static void main(String[] args) {
        Watch w1 = new Watch();
        w1.setBrand("Titan");
        w1.setWatchType("Analog");
        w1.setPrice(3000);

        String brand = w1.getBrand();
        System.out.println("WATCH BRAND - " + brand);
        System.out.println("WATCH TYPE  - " + w1.getWatchType());
        System.out.println("WATCH PRICE - INR." + w1.getPrice());
        System.out.println("____________________________");

        Scanner s = new Scanner(System.in);
        Watch w2 = new Watch();
        System.out.print("ENTER WATCH BRAND - ");
        brand = s.next();
        w2.setBrand(brand);
        System.out.print("ENTER WATCH TYPE  - ");
        w2.setWatchType(s.next());
        System.out.print("ENTER WATCH PRICE  - ");
        w2.setPrice(s.nextInt());

        System.out.println("WATCH BRAND - " + w2.getBrand());
        System.out.println("WATCH TYPE  - " + w2.getWatchType());
        System.out.println("WATCH PRICE - INR." + w2.getPrice());
        System.out.println("____________________________");

    }
}
