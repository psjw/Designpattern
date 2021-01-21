package step1;

public class Main_Adapter {
    public static void main(String[] args) {
        Adapter adapter=new AdapterImpl();
        System.out.println(adapter.twiceOf(100f));
        System.out.println(adapter.halfOf(88f));

    }
}
