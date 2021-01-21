package step1.Sam;

import step1.abst.BikeFactory;
import step1.abst.Body;
import step1.abst.Wheel;

public class SamFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
