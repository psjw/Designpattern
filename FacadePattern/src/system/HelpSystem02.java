package system;

//package
class HelpSystem02 {
    public HelpSystem02(){
        System.out.println("Call Constructor : "+getClass().getName());

    }

    public void process(){
        System.out.println("Call Process : "+getClass().getSimpleName());
    }
}
