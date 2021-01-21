package step5;

import step4.PlayController;



public class MyClassA implements Observer {
    private  boolean bPlay;//실행 여부





    public void myActControl(){
        if(bPlay){
            System.out.println("MyClassA : 동작을 시작합니다.");
        }else{
            System.out.println("MyClassA : 동작을 정지 합니다.");
        }
    }

    @Override
    public void update(boolean play) {
        this.bPlay=play;
        myActControl();
    }
}
