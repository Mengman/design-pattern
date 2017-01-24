package com.ycli.command;

import com.ycli.command.garagedoor.GarageDoor;
import com.ycli.command.garagedoor.GarageDoorDownCommand;
import com.ycli.command.garagedoor.GarageDoorUpCommand;
import com.ycli.command.light.Light;
import com.ycli.command.light.LightOffCommand;
import com.ycli.command.light.LightOnCommand;
import com.ycli.command.stereo.Stereo;
import com.ycli.command.stereo.StereoOffCommand;
import com.ycli.command.stereo.StereoOnWithCDCommand;

/**
 * Created by yucai on 2017/1/24.
 * Email: yucai.li@hpe.com
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light LivingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor(new Light("Garage Light"));
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(LivingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(LivingRoomLight);
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);
        remoteControl.setCommand(2, garageDoorUpCommand, garageDoorDownCommand);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();

        Command[] partyOn = {lightOnCommand, stereoOnWithCDCommand};
        Command[] partyOff = {lightOffCommand, stereoOffCommand};
        MacroCommand partyOnCommand = new MacroCommand(partyOn);
        MacroCommand partyOffCommand = new MacroCommand(partyOff);
        remoteControl.setCommand(4, partyOnCommand, partyOffCommand);

    }
}
