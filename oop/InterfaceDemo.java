class Watch {
    String feature;
    public void setFeature() {
        feature = "Date and Time";
    }

    public void getFeature() {
        System.out.println("BASIC FEATURE - " + feature);
    }
}

interface Android{
    int version = 14;
    String[] smartFeatures = {
            "Notifications",
            "Music Control",
            "Calling",
            "Messaging",
            "Stopwatch",
            "Health And Fitness"
    };

    public void getVersion();
    public void getSmartFeatures();
}

class SmartWatch extends Watch implements Android{
    String brandName;
    int price;

    public void setSmartWatch() {
        brandName = "Samsung";
        price = 25000;
    }

    public void getSmartWatch() {
        System.out.println("BRAND NAME - " + brandName);
        System.out.println("PRICE      - " + price);

    }

    @Override
    public void getVersion() {
        System.out.println("ANDROID VERSION - "+version);
    }

    @Override
    public void getSmartFeatures() {
        System.out.println("SMART FEATURES");
        for (int i = 0; i < smartFeatures.length; i++) {
            System.out.printf("%d. %s\n",(i+1),smartFeatures[i]);
        }
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        SmartWatch sw = new SmartWatch();
        sw.setFeature();
        sw.setSmartWatch();

        sw.getVersion();
        sw.getFeature();
        sw.getSmartFeatures();
        sw.getSmartWatch();
    }
}
