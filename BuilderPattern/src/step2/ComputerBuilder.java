package step2;

import step1.Computer;

import java.security.cert.CertPathBuilder;

public class ComputerBuilder {
    private Computer1 computer;
    private ComputerBuilder(){
        computer= new Computer1("default","default","default");
    }

    public static ComputerBuilder start() {
        return new ComputerBuilder();
    }

    public static ComputerBuilder startWithCpu(String cpu){
        ComputerBuilder builder=new ComputerBuilder();
        builder.computer.setCpu(cpu);
        return builder;
    }

    public ComputerBuilder setCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder setRam(String ram) {
        computer.setRam(ram);
        return this;
    }

    public ComputerBuilder setStorage(String storage) {
        computer.setStorage(storage);
        return this;
    }

    public Computer1 build() {
        return this.computer;
    }
}
