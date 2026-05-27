package de.jaunikapauni.axraids;

import de.jaunikapauni.axraids.listener.RaidTriggerEventListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class AxRaids extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new RaidTriggerEventListener(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
