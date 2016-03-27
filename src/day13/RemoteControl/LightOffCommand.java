package day13.RemoteControl;

/**
 * Created by arika on 16/3/22.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }
    public void execute(){
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
