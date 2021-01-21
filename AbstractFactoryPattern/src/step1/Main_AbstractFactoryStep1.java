package step1;

import step1.Sam.SamFactory;
import step1.abst.BikeFactory;
import step1.abst.Body;
import step1.abst.Wheel;
import step1.gt.GtBikeFactory;

public class Main_AbstractFactoryStep1 {
    public static void main(String[] args) {
        BikeFactory factory=new SamFactory();
        Body body=factory.createBody();
        Wheel wheel=factory.createWheel();
        System.out.println(body.getClass());
        System.out.println(wheel.getClass());



        BikeFactory factory1=new GtBikeFactory();
        Body body1=factory1.createBody();
        Wheel wheel1=factory1.createWheel();
        System.out.println(body1.getClass());
        System.out.println(wheel1.getClass());
    }
}
