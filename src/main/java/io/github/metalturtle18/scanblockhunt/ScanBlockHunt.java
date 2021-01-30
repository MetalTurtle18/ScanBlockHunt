package io.github.metalturtle18.scanblockhunt;

import io.github.metalturtle18.scanblockhunt.commands.CommandManager;
import io.github.metalturtle18.scanblockhunt.events.ItemPickupEvent;
import io.github.metalturtle18.scanblockhunt.util.Game;
import io.github.metalturtle18.scanblockhunt.util.Messenger;
import io.github.metalturtle18.scanblockhunt.util.enums.MessageSeverity;
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
