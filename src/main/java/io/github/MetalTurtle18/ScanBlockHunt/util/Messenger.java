package io.github.MetalTurtle18.ScanBlockHunt.util;

import io.github.MetalTurtle18.ScanBlockHunt.util.enums.MessageSeverity;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Messenger {
    // Overload so you can just send to a player if there is a player argument otherwise send to console
    public static void sendMessage(String message, MessageSeverity severity) {
        Bukkit.getConsoleSender().sendMessage(severity.getPrefix() + message);
    }

    public static void sendMessage(Player player, String message, MessageSeverity severity) {
        player.sendMessage(severity.getPrefix() + message);
    }
}
