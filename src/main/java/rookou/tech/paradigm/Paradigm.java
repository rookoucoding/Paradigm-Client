package rookou.tech.paradigm;

import oshi.hardware.Display;

public class Paradigm {
    private static Paradigm singleton;
    public String name = "Paradigm", version = "0.0.1";
    public static Paradigm getInstance() {
        if (singleton == null) {
            singleton = new Paradigm();
        }
        return singleton;
    }
    public void init() {
        Display.setTitle(name + " Version: " + version)   }

}
