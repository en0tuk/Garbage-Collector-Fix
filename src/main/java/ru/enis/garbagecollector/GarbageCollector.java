package ru.enis.garbagecollector;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import java.util.logging.Logger;

public class GarbageCollector extends JavaPlugin {
    Logger log = getLogger();
    public void onEnable() {
        this.saveDefaultConfig();
        new BukkitRunnable(){

            public void run() {
                if (GarbageCollector.this.getConfig().getBoolean("debug")) {
                    log.info("Running garbage collection.");
                }
                System.gc();
            }
        }.runTaskTimerAsynchronously((Plugin)this, 0L, this.getConfig().getLong("frequency") * 20L * 60L);
    }
}
