package step2.case1.step3;

public class Database2 {
    //큰리소스가 호출이 될경우 적합하지 않음 호출이 되지 않았음에도 생성이 됨
    //private static Database2 singleton=new Database2("products");

    //병목 현상 발생 -> 지속적으로 병목현상 발생 객체 생성후에도 줄을 세움
//    public synchronized static Database getInstance(String name){
    public static Database2 getInstance(String name){
//        if(singleton==null){
//            singleton=new Database(name);
//        }
        return DatabaseHelper.DATABASE_INSTANCE;
    }

    //Database2클래스가 로드 될때도 로드 되지 않다가 getInstance가 호출되는 시점에 비로서 JVM메모리에 로드되고, 인스턴스 생성
    //syncronized에 의한 병목현상 방지
    private static class DatabaseHelper{
        private static final Database2 DATABASE_INSTANCE=new Database2("product2");

        public DatabaseHelper() {
            System.out.println("DataBaseHelper 생성자");
        }
    }


    private String name;

    private Database2(String name) {
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
