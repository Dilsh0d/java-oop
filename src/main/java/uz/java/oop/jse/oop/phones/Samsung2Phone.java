package uz.java.oop.jse.oop.phones;

import uz.java.oop.jse.oop.AbstractPhone;
import uz.java.oop.jse.oop.interfaces.Mobile;

public class Samsung2Phone extends AbstractPhone implements Mobile {

    public Samsung2Phone() {
        super("Galaxy II", "6.0");
    }

    public Samsung2Phone(String name, String version) {
        super(name, version);
    }

    @Override
    public boolean isHasCamera() {
        return true;
    }

    @Override
    public boolean isHasGPS() {
        return true;
    }

    @Override
    public boolean isHasInternet() {
        return true;
    }

    @Override
    public String osName() {
        return "Android";
    }

    @Override
    public String getMobileCompanyName() {
        return "UCELL";
    }
}
