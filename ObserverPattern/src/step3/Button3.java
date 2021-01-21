package step3;


public class Button3 {

    public Button3() {
        observable = new Observable<String>();
    }

    private Observable<String> observable;

    public void addObserver(Observable.Observer<String> o) {
        observable.addObserver(o);
    }

    public void notifyObservers() {
        observable.notifyObservers(null);
    }

    public void onClick() {
        observable.setChanged();
        notifyObservers();
    }
}
