package io.github.MetalTurtle18.ScanBlockHunt.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MainCommandReceiver implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        switch (strings[0]) {
            case "start":
                // Run method in class to start game
                break;
            case "next":
                // Run method in class to move to next item
                break;
            default:
                // Something
                break;
        }


        return true;
    }
}
