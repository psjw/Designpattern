package step1;

public class ComputerFactory {
    private BluePrint bluePrint;

    public void setBulueprint(BluePrint bluePrint) {
        this.bluePrint=bluePrint;
    }

    public void make() {
        bluePrint.setCpu();
        bluePrint.setRam();
        bluePrint.setStorage();
    }

    public Computer getComputer() {

        return bluePrint.getComputer();
    }
}
