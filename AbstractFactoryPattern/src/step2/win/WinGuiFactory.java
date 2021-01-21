package step2.win;

import step2.abst.Button;
import step2.abst.GuiFactory;
import step2.abst.TextArea;

public class WinGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {

        return new WinButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WinTextArea();
    }
}
