package io.github.MetalTurtle18.ScanBlockHunt.commands;

import io.github.MetalTurtle18.ScanBlockHunt.util.BlockHuntCommand;
import io.github.MetalTurtle18.ScanBlockHunt.util.Messenger;
import io.github.MetalTurtle18.ScanBlockHunt.util.enums.MessageSeverity;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class CommandManager implements CommandExecutor {

    private final ArrayList<BlockHuntCommand> commands = new ArrayList<>();

    public CommandManager() {

    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command c, String s, String[] args) {
        if (!(commandSender instanceof Player)) {
            Messenger.sendMessage("This command can be run only by players!", MessageSeverity.INCORRECT_COMMAND_USAGE);
            return false;
        } else if (args.length <= 0) {
            Messenger.sendMessage("You need to specify a subcommand!", MessageSeverity.INCORRECT_COMMAND_USAGE);
            return false;
        }
        Player player = (Player) commandSender;
        for (BlockHuntCommand command : commands) {
            if (command.getCommandName().equalsIgnoreCase(args[0])) {
                if (!command.runCommand(player, args)) {
                    Messenger.sendMessage(player, "Command usage: " + command.getCommandUsage(), MessageSeverity.INCORRECT_COMMAND_USAGE);
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
