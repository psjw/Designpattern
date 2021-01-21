package step2.case1.step1;

import javax.xml.crypto.Data;

public class TestPattern1 {
    public static void main(String[] args) {
//        Database d1=new Database("1");
//        Database d2=new Database("2");
//        Database d3=new Database("3");
//        Database d4=new Database("4");
//        Database d5=new Database("5");

        System.out.println("database use");

        Database database=Database.getInstance("첫번쨰 Database");
        System.out.println("This is the "+database.getName()+" !!!!");
        Database database2=Database.getInstance("두번쨰 Database");
        System.out.println("This is the "+database2.getName()+" !!!!");

    }
}
