package net.consistencyteam.consistency_plus.forge;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegistryHelperImpl {
    public static Block register(String name, Block block) {
        ConsistencyPlusForge.BLOCK_REGISTRY.register(name, () -> block);
        return block;
    }

    public static Item register(String name, Item item) {
        ConsistencyPlusForge.ITEM_REGISTRY.register(name, () -> item);
        return item;
    }
}
