package io.github.metalturtle18.scanblockhunt.commands;

import io.github.metalturtle18.scanblockhunt.ScanBlockHunt;
import io.github.metalturtle18.scanblockhunt.util.BlockHuntCommand;
import io.github.metalturtle18.scanblockhunt.util.Messenger;
import io.github.metalturtle18.scanblockhunt.util.enums.MessageSeverity;
import org.bukkit.entity.Player;

public class GameInfoCommand implements BlockHuntCommand {

    @Override
    public String getCommandName() {
        return "gameinfo";
    }

    @Override
    public void runCommand(Player player, String[] args) {
        if (ScanBlockHunt.runningGame == null) {
            Messenger.sendMessage(player, "There is no game running!", MessageSeverity.INCORRECT_COMMAND_USAGE);
            return;
        }
        // TODO more checks and stuff
    }
}
