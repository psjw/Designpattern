package step2;



public class Main_BuilderPatternStep2 {
    public static void main(String[] args) {
        Computer1 computer1= ComputerBuilder
                .start()
                .setCpu("i7")
                .setRam("8g")
                .setStorage("256g ssd")
                .build();
        System.out.println(computer1.toString());
    }
}
