package me.codecraft.tut.util;

import me.codecraft.tut.Commands.ReturnHomeCommand;
import me.codecraft.tut.Commands.SetHome;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;

public class Commandregister {
    public static void CommandRegister(){
        CommandRegistrationCallback.EVENT.register(SetHome::register);
        CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);
    }
}
