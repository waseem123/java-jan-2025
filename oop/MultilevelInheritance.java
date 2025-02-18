class Box {
    int height;
    int width;

    public void setBox() {
        height = 200;
        width = 300;
    }

    public void getBox() {
        System.out.println("WIDTH  - " + width);
        System.out.println("HEIGHT - " + height);
    }
}

class ColoredBox extends Box{
    String boxColor;

    public void setBoxColor() {
        boxColor = "Brown";
    }

    public void getBoxColor() {
        System.out.println("BOX COLOR - " + boxColor);
    }
}

class ShippedBox extends ColoredBox{
    int boxWeight;
    int shippingCost;

    public void setShippedBox() {
        boxWeight = 2;
        shippingCost = 50;
    }

    public void getShippedBox() {
        System.out.println("BOX WEIGHT - " + boxWeight);
        System.out.println("SHIPPILNG COST - " + shippingCost);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        ShippedBox s = new ShippedBox();
        s.setBox();
        s.setBoxColor();
        s.setShippedBox();

        s.getBox();
        s.getBoxColor();
        s.getShippedBox();
    }
}
