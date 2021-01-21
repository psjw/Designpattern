package step2.case1.step2;

public class TestPattern2 {
    static int nNum=0;
    public static void main(String[] args) {
        Runnable task=()->{
            nNum++;
            Database database= Database.getInstance(nNum+"번째 Database");
            System.out.println("This is the "+database.getName()+" !!!");

        };
        long time1 = System.nanoTime();
        for (int i=0;i<10;i++){
            Thread t=new Thread(task);
            t.start();
        }
        long time2 = System.nanoTime();
        System.out.println("Time : "+(time2-time1));
    }
}
