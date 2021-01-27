package io.github.MetalTurtle18.ScanBlockHunt.commands;

import io.github.MetalTurtle18.ScanBlockHunt.ScanBlockHunt;
import io.github.MetalTurtle18.ScanBlockHunt.util.BlockHuntCommand;
import io.github.MetalTurtle18.ScanBlockHunt.util.Game;
import org.bukkit.entity.Player;

public class NewGameCommand implements BlockHuntCommand {
    @Override
    public String getCommandName() {
        return "create";
    }

    @Override
    public String getCommandUsage() {
        return "/blockhunt create";
    }

    @Override
    public boolean runCommand(Player player, String[] args) {
        ScanBlockHunt.runningGame = new Game(player);
        return true;
    }
}
