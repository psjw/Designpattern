package step2.case1.step1;

public class Database {
    private static Database singleton;
    //다수의 사용자가 동시 접속시 여러 인스턴스가 생성
    //Exception 처리 불가
    public static Database getInstance(String name){
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
