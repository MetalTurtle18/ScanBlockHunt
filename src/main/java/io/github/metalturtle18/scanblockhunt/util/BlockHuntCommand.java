package io.github.metalturtle18.scanblockhunt.util;

import org.bukkit.entity.Player;

public interface BlockHuntCommand {
    String getCommandName();

    void runCommand(Player player, String[] args);
}
