package io.github.MetalTurtle18.ScanBlockHunt.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MainCommandReceiver implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        if (strings.length == 0) {
            // Give a little info thing
            return true;
        }
        if (strings[0].toLowerCase().equals("start")) {
            StartCommand.start(strings);
        }
        if (strings[0].toLowerCase().equals("join")) {
            JoinCommand.join(strings);
        }

        return true;
    }
}
