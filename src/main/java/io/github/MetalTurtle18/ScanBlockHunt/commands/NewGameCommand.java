package io.github.MetalTurtle18.ScanBlockHunt.commands;

import io.github.MetalTurtle18.ScanBlockHunt.ScanBlockHunt;
import io.github.MetalTurtle18.ScanBlockHunt.util.BlockHuntCommand;
import io.github.MetalTurtle18.ScanBlockHunt.util.Game;
import io.github.MetalTurtle18.ScanBlockHunt.util.Messenger;
import io.github.MetalTurtle18.ScanBlockHunt.util.enums.MessageSeverity;
import org.bukkit.entity.Player;

public class NewGameCommand implements BlockHuntCommand {
    @Override
    public String getCommandName() {
        return "create";
    }

    @Override
    public void runCommand(Player player, String[] args) {
        if (ScanBlockHunt.runningGame != null) { // There is already a game running
            Messenger.sendMessage(player, "There is already a game running so you cannot start a new one!", MessageSeverity.INCORRECT_COMMAND_USAGE);
            return;
        }
        ScanBlockHunt.runningGame = new Game(player);
    }
}
