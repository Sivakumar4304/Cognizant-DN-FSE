//command pattern converts request into a object , so that request can be executed later.
interface Command {
    public void execute();
}

class Light {
    void on() {
        System.out.println("Light is on");
    }

    void off() {
        System.out.println("Light is off");
    }
}

class LightOnCommand implements Command {
    Light light;

    LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}

class LightOffCommand implements Command {
    Light light;

    LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}

class RemoteControl {
    Command command;

    RemoteControl(Command command) {
        this.command = command;
    }

    void PressButton() {
        command.execute();
    }
}

public class CommandPatternExample {
    public static void main(String[] args) {

        Light light = new Light();

        Command on = new LightOnCommand(light);
        RemoteControl remote1 = new RemoteControl(on);
        remote1.PressButton();

        Command off = new LightOffCommand(light);
        RemoteControl remote2 = new RemoteControl(off);
        remote2.PressButton();

    }
}
