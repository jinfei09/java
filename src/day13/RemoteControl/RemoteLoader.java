package day13.RemoteControl;

/**
 * Created by arika on 16/3/22.
 */
public class RemoteLoader {
    public static void main(String[] args){
//        RemoteControl remoteControl = new RemoteControl();
//
//        Light livingRoomLight = new Light("Living Room");
//        Light kitchenLight = new Light("Kitchen");
//
//        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);

    }
}
