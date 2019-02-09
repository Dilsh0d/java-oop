package uz.java.oop.jse.oop.phones;

import uz.java.oop.jse.oop.AbstractPhone;
import uz.java.oop.jse.oop.interfaces.Stationary;

public class PanasonicTelephone extends AbstractPhone implements Stationary {

    public PanasonicTelephone() {
        super("Panasonic", "2.0");
    }

    public PanasonicTelephone(String name, String version) {
        super(name, version);
    }

    @Override
    public boolean isHasCamera() {
        return false;
    }

    @Override
    public boolean isHasGPS() {
        return false;
    }

    @Override
    public boolean isHasInternet() {
        return true;
    }

    @Override
    public String osName() {
        return "Custom OS";
    }

    @Override
    public String getInternetproviderName() {
        return "UzOnline";
    }
}
