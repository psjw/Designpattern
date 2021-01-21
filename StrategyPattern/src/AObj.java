public class AObj {

    Ainterface ainterface;

    public AObj(){
        ainterface=new AinterfaceImpl();
    }

    public void funcAA(){
        //다른 객체의 기능을 사용하는 것 위임한다.
        ainterface.funcA();
        ainterface.funcA();
        //System.out.println("AAA");
        //System.out.println("AAA");

        //~기능이필요합니다. 개발해주세요
    }
}
