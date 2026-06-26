//builder pattern is used to create complex objects in simple stepbystep . 
class Computer {
    String CPU;
    int Storage;
    int RAM;

    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.Storage = builder.Storage;
        this.RAM = builder.RAM;
    }

    void display() {
        System.out.println("CPU : " + CPU);
        System.out.println("RAM : " + RAM);
        System.out.println("Storage :" + Storage);
    }

    static class ComputerBuilder {
        String CPU;
        int RAM;
        int Storage;

        ComputerBuilder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        ComputerBuilder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        ComputerBuilder setStorage(int Storage) {
            this.Storage = Storage;
            return this;
        }

        Computer build() {
            return new Computer(this);
        }
    }
}

public class BuilderPatternExample {
    public static void main(String[] args) {

        Computer c1 = new Computer.ComputerBuilder()
                .setCPU("Intel 17")
                .setRAM(16)
                .setStorage(1024)
                .build();
        c1.display();
    }
}