package me.jonpecar.vegova;

import org.bukkit.plugin.java.JavaPlugin;

public final class Vegova extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Vegova plugin enabled");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Vegova plugin disabled");
    }
}
