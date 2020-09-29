package io.github.MetalTurtle18.ScanBlockHunt.commands;

import io.github.MetalTurtle18.ScanBlockHunt.ScanBlockHunt;
import org.bukkit.entity.Player;

public class JoinCommand {
    public static void join(Player player, String[] args) {
        //if (ScanBlockHunt.runningGame.)
        ScanBlockHunt.runningGame.addPlayer(player.getUniqueId().toString());
    }
}
