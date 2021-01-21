package step2.win;

import step2.abst.Button;

public class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("윈도우 버튼");
    }
}
