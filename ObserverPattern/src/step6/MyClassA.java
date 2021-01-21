package step6;


public class MyClassA implements Observer {
    private  boolean bPlay;//실행 여부
    Publisher observable; //등록될 Observable

    public MyClassA(Publisher o) {
        this.observable = o;
        observable.addObserver(this);
    }

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
