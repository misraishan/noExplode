package hayhay.cc.noExplode;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class noExplodeListener implements Listener {
    @EventHandler
    public void onCreeperExplode(EntityExplodeEvent event) {
        switch (event.getEntityType()) {
            case CREEPER: event.setCancelled(true);
            case FIREBALL: event.setCancelled(true);
        }
    }
}
