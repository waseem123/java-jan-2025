class Computer {
    String brandName;
    int RAM;
    int ROM;
    String processor;

    public void setComputer() {
        brandName = "Lenovo";
        RAM = 8;
        ROM = 512;
        processor = "Intel Core i5 11Gen";
    }

    public void getComputer() {
        System.out.println("BRAND     - " + brandName);
        System.out.println("RAM       - " + RAM);
        System.out.println("ROM       - " + ROM);
        System.out.println("PROCESSOR - " + processor);
    }
}

class Laptop extends Computer {
    String type;
    int price;
    String modelName;
    String color;

    public void setLaptop() {
        type = "Touch Screen and Foldable Laptop";
        price = 67000;
        color = "Glossy Black";
        modelName = "Lenovo IdeaPad - 1498";
    }

    public void getLaptop() {
        System.out.println("TYPE  - " + type);
        System.out.println("COLOR - " + color);
        System.out.println("MODEL - " + modelName);
        System.out.println("PRICE - " + price);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.setComputer();
        l.getComputer();
        l.setLaptop();
        l.getLaptop();
    }
}
