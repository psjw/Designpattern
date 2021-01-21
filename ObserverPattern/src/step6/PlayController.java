package step6;


import java.util.ArrayList;
import java.util.List;


public class PlayController implements Publisher { //감시의 대상
    private List<Observer> observers=new ArrayList<>();
    private  boolean play;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        int index=observers.indexOf(observer);
        observers.remove(index);
    }



    @Override
    public void notifyObservers() {

        for(int i=0;i<observers.size();i++){
            observers.get(i).update(play);
        }
        //다음을 사용하면 구독해지시 다음과 같은 에러가 발생한다.
        //ConcurrentModificationException
//        for(Observer observer:observers){
//            observer.update(play);
//        }
    }

    public void setFlag(boolean play){
        this.play=play;
        notifyObservers();
    }

    public boolean getFlag(){
        return this.play;
    }
}
