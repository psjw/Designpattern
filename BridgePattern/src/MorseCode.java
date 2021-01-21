public class MorseCode {
    private MorseCodeFunction function;

    public MorseCode(MorseCodeFunction function){
        this.function=function;
    }

    public void setFunction(MorseCodeFunction function) {
        this.function = function;
    }

    public void dot(){
        function.dot();

//        System.call.Bip();
    }
    public void dash(){
        function.dash();

//        System.call.longBit();
    }
    public void space(){
        function.space();
//        System.call.longTip();
    }
}
