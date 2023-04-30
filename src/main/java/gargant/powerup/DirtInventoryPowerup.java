package gargant.powerup;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import gargant.strafes.classes.Powerup;
import lombok.NonNull;

/**
 * A powerup that gives the player a dirt block in their inventory.
 */
public class DirtInventoryPowerup extends Powerup {

    public DirtInventoryPowerup(@NonNull String name) {
        super(name);
    }

    @Override
    public void apply(Player player, int level, int duration) {
        // The powerup we're writing does not depend on the duration.

        // We're going to give the player a dirt block in their inventory for every level.
        int stacks = level / 64;
        int remainder = level % 64;
        
        for (int i = 0; i < stacks; i++)
            player.getInventory().addItem(new ItemStack(Material.DIRT, 64));

        player.getInventory().addItem(new ItemStack(Material.DIRT, remainder));    
    }

}
