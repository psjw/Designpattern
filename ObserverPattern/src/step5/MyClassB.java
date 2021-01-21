package step5;

import step4.PlayController;



public class MyClassB implements Observer {

    private  boolean bPlay;//실행 여부




    public void myActControl(){
        if(bPlay){
            System.out.println("MyClassB : 동작을 시작합니다.");
        }else{
            System.out.println("MyClassB : 동작을 정지 합니다.");
            //옵저버에서 현재 객체 제거
//            observable.deleteObserver(this);
        }
    }

    @Override
    public void update(boolean play) {
        this.bPlay=play;
        myActControl();
    }
}
