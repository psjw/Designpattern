package step2.case1.step2;

public class TestPattern3 {
    static int nNum=0;
    public static void main(String[] args) {
        Runnable task=()->{
            nNum++;
            Database2 database= Database2.getInstance(nNum+"번째 Database");
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
