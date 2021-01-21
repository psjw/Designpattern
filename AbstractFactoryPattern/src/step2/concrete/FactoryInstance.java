package step2.concrete;

import step2.abst.GuiFactory;
import step2.linux.LinuxGuiFactory;
import step2.mac.MacGuiFactory;
import step2.win.WinGuiFactory;

public class FactoryInstance {

    public static GuiFactory getGuiFactory() {


        switch (getOsCode()){
            case 0:
                return new MacGuiFactory();
            case 1:
                return new LinuxGuiFactory();
            case 2:
                return new WinGuiFactory();
        }
        return null;
    }

    private static int getOsCode() {
        if(System.getProperty("os.name").equals("Mac OS X")){
            return 0;
        }
        return 1;
    }
}






