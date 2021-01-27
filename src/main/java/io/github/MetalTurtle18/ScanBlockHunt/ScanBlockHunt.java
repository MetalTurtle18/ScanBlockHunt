package io.github.MetalTurtle18.ScanBlockHunt;

import io.github.MetalTurtle18.ScanBlockHunt.util.Game;
import io.github.MetalTurtle18.ScanBlockHunt.util.Messenger;
import io.github.MetalTurtle18.ScanBlockHunt.util.enums.MessageSeverity;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class ScanBlockHunt extends JavaPlugin {

    public static Game runningGame;

    @Override
    public void onEnable() {
        Messenger.sendMessage("Plugin loaded successfully!", MessageSeverity.INFO);
    }

    @Override
    public void onDisable() {
        Messenger.sendMessage("Plugin disabled successfully!", MessageSeverity.INFO);
    }
}
