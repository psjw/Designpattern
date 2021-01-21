public class Main_DeepShallow {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat navi=new Cat();
        navi.setName("navi");
        navi.setAge(3);
        //얕은 복사(동일 주소)
        Cat yo =navi;
        yo.setName("yo");
        yo.setAge(1);
        //깊은 복사(동일 값만 복사)
        Cat yo1=navi.copy();
        yo1.setName("yo1");
        yo1.setAge(2);

        System.out.println(navi.getName());
        System.out.println(yo.getName());
        System.out.println(yo1.getName());

        System.out.println(navi.getAge());
        System.out.println(yo.getAge());
        System.out.println(yo1.getAge());



        Dog dogi=new Dog();
        dogi.setName("navi");
        dogi.setAge(new Age(2012,3));
        //얕은 복사(동일 주소)
        Dog bul=dogi;
        bul.setName("bul");
        bul.setAge(new Age(2014,1));
        //깊은 복사(동일 값만 복사)
        Dog bul1=dogi.copy();
        bul1.setName("bul1");
        bul1.setAge(new Age(2013,2));

        System.out.println(dogi.getName());
        System.out.println(bul.getName());
        System.out.println(bul1.getName());

        System.out.println(dogi.getAge().getYear());
        System.out.println(bul.getAge().getYear());
        System.out.println(bul1.getAge().getYear());

        System.out.println(dogi.getAge().getValue());
        System.out.println(bul.getAge().getValue());
        System.out.println(bul1.getAge().getValue());

        System.out.println("#######");
        Dog bul2=dogi.copy();
        bul1.getAge().setYear(2013);
        bul1.getAge().setValue(2);
        //얕은 복사로 됨
        System.out.println(bul2.getAge().getYear());
        System.out.println(bul2.getAge().getValue());
        System.out.println(dogi.getAge().getYear());
        System.out.println(dogi.getAge().getValue());

        System.out.println("#######");
        Dog bul3=dogi.deepCopy();
        bul3.getAge().setYear(2015);
        bul3.getAge().setValue(0);
        System.out.println(bul3.getAge().getYear());
        System.out.println(bul3.getAge().getValue());
        System.out.println(dogi.getAge().getYear());
        System.out.println(dogi.getAge().getValue());

    }
}
