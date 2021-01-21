package step2.mac;

import step2.abst.Button;
import step2.abst.GuiFactory;
import step2.abst.TextArea;

public class MacGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacTextArea();
    }
}
