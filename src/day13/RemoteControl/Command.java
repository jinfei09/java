package day13.RemoteControl;

/**
 * Created by arika on 16/3/22.
 */
public interface Command {
    public void execute();
    public void undo();
}
