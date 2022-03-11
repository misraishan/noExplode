package hayhay.cc.noExplode;

import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;

public final class NoExplode extends JavaPlugin {

    Logger log = getLogger();

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new noExplodeListener(), this);
        log.info("noExplode started. Now cancelling creeper explosions.");
    }

    @Override
    public void onDisable() {
        log.info("noExplode disabled.");
    }
}
