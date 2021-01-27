package io.github.MetalTurtle18.ScanBlockHunt.util.enums;

import org.bukkit.ChatColor;

public enum MessageSeverity {
    INFO(ChatColor.GREEN),
    FATAL_ERROR(ChatColor.DARK_RED),
    INCORRECT_COMMAND_USAGE(ChatColor.DARK_PURPLE),
    IMPORTANT(ChatColor.DARK_BLUE);

    private final ChatColor color;
    MessageSeverity(ChatColor color) {
        this.color = color;
    }

    public String getPrefix() {
        return ChatColor.GOLD + "[Scandium21's Block Hunt] " + color;
    }
}
