package net.consistencyteam.consistency_plus;

import me.shedaniel.architectury.annotations.ExpectPlatform;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegistryHelper {
    @ExpectPlatform
    public static Block register(String name, Block block) {
        throw new UnsupportedOperationException();
    }

    @ExpectPlatform
    public static Item register(String name, Item item) {
        throw new UnsupportedOperationException();
    }
}
