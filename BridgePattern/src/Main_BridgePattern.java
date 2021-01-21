public class Main_BridgePattern {
    public static void main(String[] args) {
//        PrintMorseCode code=new PrintMorseCode(new SoundMorseCodeFunction());
        PrintMorseCode code=new PrintMorseCode(new FlashMorseCodeFunction());
//        PrintMorseCode code=new PrintMorseCode(new DefaultMorseCodeFunction());
//        code.g();        code.a();        code.r();        code.a();        code.m();
        code.g().r().a().r().a().m();
    }
}
