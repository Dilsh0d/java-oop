package uz.java.oop.jse.oop.phones;

import uz.java.oop.jse.oop.AbstractPhone;
import uz.java.oop.jse.oop.interfaces.Mobile;

public class IPhone extends AbstractPhone implements Mobile {

    public IPhone() {
        super("IPhone", "7");
    }

    public IPhone(String name, String version) {
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
        return "iOS";
    }

    @Override
    public String getMobileCompanyName() {
        return "UMS";
    }
}
