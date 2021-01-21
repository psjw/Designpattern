package step4;

import java.util.Observable;

public class PlayController extends Observable { //감시의 대상

    private  boolean bplay;

    public PlayController() {
    }

    //데이터를 전달 받아 플래그 값을 변경하고,
    //새로운 데이터가 들어왔음을 알린다.
    public void setFlag(boolean bplay){
        this.bplay=bplay;
        setChanged();
        notifyObservers(); //새로운 데이터가 들어 왔음을 알림 MyClassA의 update메서드 호출
    }

    //실행여부 플래그값 반환
    public boolean getFlag(){
        return bplay;
    }
}
