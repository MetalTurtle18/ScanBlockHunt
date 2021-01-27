package io.github.MetalTurtle18.ScanBlockHunt;

import io.github.MetalTurtle18.ScanBlockHunt.commands.CommandManager;
import io.github.MetalTurtle18.ScanBlockHunt.events.ItemPickupEvent;
import io.github.MetalTurtle18.ScanBlockHunt.util.Game;
import io.github.MetalTurtle18.ScanBlockHunt.util.Messenger;
import io.github.MetalTurtle18.ScanBlockHunt.util.enums.MessageSeverity;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class ScanBlockHunt extends JavaPlugin {

    public static Game runningGame; // For now there can be only one game running at a time

    @Override
    public void onEnable() {
        runningGame = null;
        PluginManager pluginManager = getServer().getPluginManager();
        Objects.requireNonNull(getCommand("blockhunt")).setExecutor(new CommandManager());
        pluginManager.registerEvents(new ItemPickupEvent(), this);
        Messenger.sendMessage("Plugin loaded successfully!", MessageSeverity.INFO);
    }

    @Override
    public void onDisable() {
        Messenger.sendMessage("Plugin disabled successfully!", MessageSeverity.INFO);
    }
}
