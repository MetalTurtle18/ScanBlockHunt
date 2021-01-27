package io.github.MetalTurtle18.ScanBlockHunt.util;

import org.bukkit.entity.Player;

public interface BlockHuntCommand {
    String getCommandName();

    String getCommandUsage();

    boolean runCommand(Player player, String[] args);
}
