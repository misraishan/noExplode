package hayhay.cc.noExplode;

import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class noExplodeListener implements Listener {
    @EventHandler
    public void onCreeperExplode(EntityExplodeEvent event) {
        switch (event.getEntityType()) {
            case CREEPER:
                event.blockList().clear();
                break;
            case FIREBALL:
                event.blockList().clear();
                break;
            default:
                break;
        }
    }

    @EventHandler
    public void onItemDamage(EntityDamageEvent event) {
        if (event.getEntity() instanceof Item) {
            // Check for any explosion-related damage
            if (event.getCause() == EntityDamageEvent.DamageCause.ENTITY_EXPLOSION ||
                    event.getCause() == EntityDamageEvent.DamageCause.BLOCK_EXPLOSION) {
                event.setCancelled(true);
            }
        }
    }
}