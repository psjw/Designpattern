package step4;

import java.util.Observable;
import java.util.Observer;

public class MyClassB implements Observer {
    Observable observable;//등록될 Observable
    private  boolean bPlay;//실행 여부



    public MyClassB(Observable o){
        this.observable=o;
        observable.addObserver(this);//옵저버에 현재 클래스 등록 PlayController의 Observer에 등록
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof PlayController){
            PlayController myControl=(PlayController)o;
            this.bPlay=myControl.getFlag();
            myActControl();
        }
    }

    public void myActControl(){
        if(bPlay){
            System.out.println("MyClassB : 동작을 시작합니다.");
        }else{
            System.out.println("MyClassB : 동작을 정지 합니다.");
            //옵저버에서 현재 객체 제거
            observable.deleteObserver(this);
        }
    }
}
