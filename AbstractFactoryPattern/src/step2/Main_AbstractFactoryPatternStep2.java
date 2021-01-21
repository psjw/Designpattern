package step2;

import step2.abst.Button;
import step2.abst.GuiFactory;
import step2.abst.TextArea;
import step2.concrete.FactoryInstance;
import step2.linux.LinuxGuiFactory;
import step2.mac.MacGuiFactory;
import step2.win.WinGuiFactory;

public class Main_AbstractFactoryPatternStep2 {
    public static void main(String[] args) {
//        GuiFactory guiFactory=new WinGuiFactory();
//        GuiFactory guiFactory=new MacGuiFactory();
//        GuiFactory guiFactory=new WinGuiFactory();
        GuiFactory guiFactory= FactoryInstance.getGuiFactory();
        Button button=guiFactory.createButton();
        TextArea textArea=guiFactory.createTextArea();

        button.click();
        System.out.println(textArea.getText());

        System.out.println(System.getProperty("os.name"));
    }
}
