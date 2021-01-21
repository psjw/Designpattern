package concrete;

import abst.IBeverage;


//Role : ConcreteComponent
//Component의 실질적인 인스턴스 부분이며, 책임의 주체 입니다.
public class Base implements IBeverage {
    @Override
    public int getTotalPrice() {
        return 0;
    }
}
