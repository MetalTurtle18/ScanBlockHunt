package io.github.metalturtle18.scanblockhunt.commands;

import io.github.metalturtle18.scanblockhunt.util.BlockHuntCommand;
import io.github.metalturtle18.scanblockhunt.util.Messenger;
import io.github.metalturtle18.scanblockhunt.util.enums.MessageSeverity;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class CommandManager implements CommandExecutor, TabCompleter {

    private final ArrayList<BlockHuntCommand> commands = new ArrayList<>();

    public CommandManager() {
        commands.add(new NewGameCommand());
        commands.add(new JoinGameCommand());
        commands.add(new GameInfoCommand());
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command c, String s, String[] args) {
        if (!(commandSender instanceof Player)) {
            Messenger.sendMessage("This command can be run only by players!", MessageSeverity.INCORRECT_COMMAND_USAGE);
            return true;
        } else if (args.length <= 0) {
            Messenger.sendMessage("You need to specify a subcommand!", MessageSeverity.INCORRECT_COMMAND_USAGE);
            return true;
        }
        Player player = (Player) commandSender;
        for (BlockHuntCommand command : commands) {
            if (command.getCommandName().equalsIgnoreCase(args[0])) {
                command.runCommand(player, args);
            }
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return null;
    }
}
