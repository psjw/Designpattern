package step2.case1.step2;

public class Database {
    private static Database singleton;

    //병목 현상 발생 -> 지속적으로 병목현상 발생 객체 생성후에도 줄을 세움
    public synchronized static Database getInstance(String name){
        if(singleton==null){
            singleton=new Database(name);
        }
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
