package NoGrief;

import org.bukkit.plugin.java.JavaPlugin;

public final class NoGrief extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ExplosionListener(), this);
        getLogger().info("NoCreeperGrief enabled.");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
