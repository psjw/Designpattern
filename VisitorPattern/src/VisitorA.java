public class VisitorA implements Visitor{

    private int ageSum;
    public VisitorA(){
        ageSum=0;
    }
    @Override
    public void visit(Visitable visitable) {
        if(visitable instanceof VisitorbleA){
            ageSum+=((VisitorbleA) visitable).getAge();
        }else{
            //..
        }
    }

    public int getAgeSum() {
        return ageSum;
    }
}
