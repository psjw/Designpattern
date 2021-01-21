package step1;

public class Main_BuilderPatternStep1 {
    public static void main(String[] args) {

        ComputerFactory factory=new ComputerFactory();
        factory.setBulueprint(new LgGramBlueprint());
//        factory.setBulueprint(new MacAirBlueprint());
//        factory.setBulueprint(new SonyBlueprint());

        factory.make();
        Computer computer=factory.getComputer();

        System.out.println(computer.toString());
    }
}
