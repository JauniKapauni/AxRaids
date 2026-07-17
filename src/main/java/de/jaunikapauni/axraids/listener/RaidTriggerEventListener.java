package de.jaunikapauni.axraids.listener;

import de.jaunikapauni.axraids.AxRaids;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.raid.RaidTriggerEvent;

public class RaidTriggerEventListener implements Listener {
    AxRaids reference;
    public RaidTriggerEventListener(AxRaids reference){
        this.reference = reference;
    }

    @EventHandler
    public void onRaid(RaidTriggerEvent e){
        if(!reference.isRaidsEnabled()){
            e.setCancelled(true);
        }
    }
}
