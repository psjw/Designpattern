package step2;


import step1.Button;

import java.util.Observable;
import java.util.Observer;

public class Application_ObserverPatternStep2 {
    public static void main(String[] args) {
        Button2 button2=new Button2();
        button2.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println(o+"is Clicked");
            }
        });
        button2.onClick();
        button2.onClick();
        button2.onClick();
    }
}
