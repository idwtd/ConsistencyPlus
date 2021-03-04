package net.consistencyteam.consistency_plus.forge;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("consistency_plus")
public class ConsistencyPlusForge {
    public static final DeferredRegister<Block> BLOCK_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, "consistency_plus");
    public static final DeferredRegister<Item> ITEM_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "consistency_plus");

    public ConsistencyPlusForge() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        System.out.println("Consistency+ Main - Starting Initialization");
        System.out.println("Consistency+ Main - Beginning Block Initialization");
        BLOCK_REGISTRY.register(eventBus);
        // Blocks.init(); // TODO
        System.out.println("Consistency+ Main - Blocks Initialized");
        System.out.println("Consistency+ Main - Beginning Item Initialization");
        ITEM_REGISTRY.register(eventBus);
        // Items.init(); // TODO
        System.out.println("Consistency+ Main - Items Initialized");
        System.out.println("Consistency+ Main - Finished Initialization");
    }
}
