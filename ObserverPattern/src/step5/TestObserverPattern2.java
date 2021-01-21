package step5;




public class TestObserverPattern2 {
    public static void main(String[] args) {
        PlayController pager=new PlayController();

        Observer ob1=new MyClassA();
        Observer ob2=new MyClassB();
        //구독자(옵저버)등록
        pager.addObserver(ob1);
        pager.addObserver(ob2);

        //메시지 등록
        pager.setFlag(false);

        //구독해지
        pager.deleteObserver(ob2);

        System.out.println("---------");

        pager.setFlag(true);
    }
}
