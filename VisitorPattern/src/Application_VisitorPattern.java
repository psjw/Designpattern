import java.util.ArrayList;

public class Application_VisitorPattern {
    public static void main(String[] args) {
//        Visitable v1=new VisitorbleA();
        ArrayList<Visitable> visitables=new ArrayList<Visitable>();
        visitables.add(new VisitorbleA(1));
        visitables.add(new VisitorbleA(2));
        visitables.add(new VisitorbleA(3));
        visitables.add(new VisitorbleA(4));
        visitables.add(new VisitorbleA(5));
        Visitor visitor=new VisitorA();
        int ageSum = 0;
        for (Visitable visitable:visitables){
//            visitable.accept(visitor);
            ageSum+=((VisitorbleA)visitable).getAge();
        }
//        System.out.println(visitor.getAgeSum());
        System.out.println(ageSum);
    }
}
