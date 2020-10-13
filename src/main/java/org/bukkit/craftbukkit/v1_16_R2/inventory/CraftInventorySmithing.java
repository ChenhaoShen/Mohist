package org.bukkit.craftbukkit.v1_16_R2.inventory;

import net.minecraft.inventory.IInventory;
import org.bukkit.Location;
import org.bukkit.inventory.SmithingInventory;

public class CraftInventorySmithing extends CraftResultInventory implements SmithingInventory {

    private final Location location;

    public CraftInventorySmithing(Location location, IInventory inventory, IInventory resultInventory) {
        super(inventory, resultInventory);
        this.location = location;
    }

    @Override
    public Location getLocation() {
        return location;
    }
}