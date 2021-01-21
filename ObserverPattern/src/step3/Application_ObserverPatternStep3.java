package step3;

import step1.Button;

public class Application_ObserverPatternStep3 {
    public static void main(String[] args) {
        //1. 제네릭
        //2. 델리게이트
        //3. 내부에 옵저버를 넣는다.
        Button3 button3=new Button3();
        button3.addObserver(new Observable.Observer<String>() {
            @Override
            public void update(Observable<String> o, String arg) {
                System.out.println(o+" is Clicked");
            }
        });

        button3.onClick();
        button3.onClick();
        button3.onClick();
    }
}
