package net.consistencyteam.consistency_plus.fabric;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegistryHelperImpl {
    public static Block register(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier("consistency_plus", name), block);
    }

    public static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("consistency_plus", name), item);
    }
}
