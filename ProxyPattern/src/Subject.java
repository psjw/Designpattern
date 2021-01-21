public interface Subject {
    //리소스가 적게 드는일
    void action1();
    //리소스가 많이 드는 일(네트워크, 메모리 사용 많음)
    void action2();
}
