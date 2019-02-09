package uz.java.oop.jse.oop;

public abstract class AbstractPhone {
    private String name;
    private String version;

    public AbstractPhone(String name,String version){
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public abstract boolean isHasCamera();

    public abstract boolean isHasGPS();

    public abstract boolean isHasInternet();

    public abstract String osName();

    public void call(String number){
        System.out.println(number);
    }

    public void call(char[] number){
        System.out.println(number);
    }
}
