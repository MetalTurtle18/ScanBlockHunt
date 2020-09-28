package io.github.MetalTurtle18.ScanBlockHunt;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class ScanBlockHunt extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + "[Scandium21's Block Hunt]: " + ChatColor.GREEN + "Plugin loaded!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + "[Scandium21's Block Hunt]: " + ChatColor.RED + "Plugin unloaded!");
    }

}
