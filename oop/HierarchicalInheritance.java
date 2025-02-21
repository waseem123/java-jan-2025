class Hardware {
    String company;
    String definition;

    public void setHardware() {
        company = "Logitech";
        definition = "Hardware is the component to operate the computer";
    }

    public void getHardware() {
        System.out.println("COMPANY - " + company);
        System.out.println("DEFINITION - " + definition);
    }
}

class InputDevices extends Hardware{
    String[] devices;

    public void setInputDevices() {
        devices = new String[]{"Keyboard", "Mouse", "Mike", "Touchpad", "Camera"};
    }

    public void getInputDevices() {
        System.out.println("LIST OF INPUT DEVICES");
        for (String d : devices) {
            System.out.println(d);
        }
    }
}

class OutputDevices extends Hardware{
    String[] devices;

    public void setOutputDevices() {
        devices = new String[]{"Screen", "Printer", "Speakers", "Earphones"};
    }

    public void getOutputDevices() {
        System.out.println("LIST OF OUTPUT DEVICES");
        for (String d : devices) {
            System.out.println(d);
        }
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        InputDevices i = new InputDevices();
        i.setHardware();
        i.setInputDevices();
        i.getHardware();
        i.getInputDevices();
        System.out.println("______________________");

        OutputDevices o = new OutputDevices();
        o.setHardware();
        o.setOutputDevices();
        o.getHardware();
        o.getOutputDevices();
    }
}
