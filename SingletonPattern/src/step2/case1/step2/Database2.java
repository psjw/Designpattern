package step2.case1.step2;

public class Database2 {
    private static Database2 singleton;

    //병목 현상 발생 -> 지속적으로 병목현상 발생 객체 생성후에도 줄을 세움
    public  static Database2 getInstance(String name){
        if(singleton==null){//singleton이 null일 경우에만 동작 -> 병목현상은 그대로 존재
            synchronized (Database2.class){
                if (singleton==null)
                    singleton=new Database2(name);
            }
        }
        return singleton;
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
