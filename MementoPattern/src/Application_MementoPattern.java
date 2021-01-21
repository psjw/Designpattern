import abc.Memento;
import abc.Originator;

import java.util.Stack;

public class Application_MementoPattern {
    public static void main(String[] args) {
        Stack<Memento> mementos=new Stack<>();
        Originator originator=new Originator();

        originator.setState("state 1");
        Memento memento1=originator.createMemento();
        mementos.push(memento1);

        originator.setState("state 2");
        Memento memento2=originator.createMemento();
        mementos.push(memento2);

//      protected로 외부접근이 안된다. -> 보안
//        Memento mementosome=originator.createMemento();
//        mementosome=new Memento("state something");
//        mementos.push(mementosome);

        originator.setState("state 3");
        Memento memento3=originator.createMemento();
        mementos.push(memento3);

        originator.setState("state final");
        Memento memento4=originator.createMemento();
        mementos.push(memento4);


        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());


        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());

        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());

        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());

    }
}
