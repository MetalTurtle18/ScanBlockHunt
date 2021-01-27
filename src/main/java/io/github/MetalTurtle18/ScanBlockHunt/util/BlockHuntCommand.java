package io.github.MetalTurtle18.ScanBlockHunt.util;

import org.bukkit.entity.Player;

public interface BlockHuntCommand {
    String getCommandName();

    void runCommand(Player player, String[] args);
}
