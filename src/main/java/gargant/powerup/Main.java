package gargant.powerup;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffectType;

import gargant.strafes.classes.EffectPowerup;
import gargant.strafes.classes.StrafesAPI;
import gargant.strafes.main.Strafes;

public class Main extends JavaPlugin {

    private StrafesAPI api;

    @Override
    public void onEnable() {
        this.api = Strafes.getApi();

        /*
         * Example of registering a new, simple effect powerup.
         */
        this.api.getPowerupService().registerPowerup(new EffectPowerup("blind", PotionEffectType.BLINDNESS));

        /*
         * Example of registering a new, more complex effect powerup.
         */
        this.api.getPowerupService().registerPowerup(new DirtInventoryPowerup("dirt"));

        System.out.println("Loaded powerups!");

    }
}
