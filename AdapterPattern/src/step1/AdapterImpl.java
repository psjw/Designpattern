package step1;

public class AdapterImpl implements Adapter{


    @Override
    public Float twiceOf(Float f) {

        //return (float)Math.twoTime(f.doubleValue());
        return  Math.doublled(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f) {
        System.out.println("절반 함수 시작");
        return (float)Math.half(f.doubleValue());
    }
}
