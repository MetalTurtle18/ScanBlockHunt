package io.github.MetalTurtle18.ScanBlockHunt.events;

import com.sun.tools.jdeprscan.scan.Scan;
import io.github.MetalTurtle18.ScanBlockHunt.ScanBlockHunt;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;

public class ItemPickupEvent implements Listener {

    @EventHandler
    public void onItemPickup(EntityPickupItemEvent event) {
        if (!(event.getEntity() instanceof Player) || ScanBlockHunt.runningGame == null || ScanBlockHunt.runningGame.getCurrentItem() == null) return;
        Player player = (Player) event.getEntity();
        if (event.getItem().equals(ScanBlockHunt.runningGame.getCurrentItem()) && ScanBlockHunt.runningGame.roundGoing) {
            ScanBlockHunt.runningGame.itemFound(player);
        }
    }
}
