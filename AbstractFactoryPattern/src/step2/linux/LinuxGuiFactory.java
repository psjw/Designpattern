package step2.linux;

import step2.abst.Button;
import step2.abst.GuiFactory;
import step2.abst.TextArea;

public class LinuxGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {

        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}
