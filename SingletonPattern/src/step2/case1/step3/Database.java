package step2.case1.step3;

public class Database {
    //큰리소스가 호출이 될경우 적합하지 않음 호출이 되지 않았음에도 생성이 됨
    private static Database singleton=new Database("products");

    //병목 현상 발생 -> 지속적으로 병목현상 발생 객체 생성후에도 줄을 세움
//    public synchronized static Database getInstance(String name){
    public static Database getInstance(String name){
//        if(singleton==null){
//            singleton=new Database(name);
//        }
        return singleton;
    }
    private String name;

    private Database(String name) {
        try {
            Thread.sleep(100);
            this.name = name;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

}
