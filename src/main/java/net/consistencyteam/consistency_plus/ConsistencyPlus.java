package net.consistencyteam.consistency_plus;

import net.consistencyteam.consistency_plus.BlockCrafter.BlockCrafter;
import net.consistencyteam.consistency_plus.BlockCrafter.BlockCrafterEntity;
import net.consistencyteam.consistency_plus.BlockCrafter.BlockCrafterGuiDescription;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.cottonmc.cotton.gui.client.LibGuiClient.MODID;
import static net.consistencyteam.consistency_plus.Blocks.BLOCK_CRAFTER;


public class ConsistencyPlus implements ModInitializer {
    public static final Item WARPED_NETHER_WART = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    // create Block Crafter block entity
    public static BlockEntityType<BlockCrafterEntity> BLOCK_CRAFTER_ENTITY;
    // create Block Crafter ScreenHandler
    public static ScreenHandlerType<BlockCrafterGuiDescription> BLOCK_CRAFTER_GUI_SCREEN_HANDLER_TYPE;

    @Override
	public void onInitialize() {
        // register Block Crafter ScreenHandler
        BLOCK_CRAFTER_GUI_SCREEN_HANDLER_TYPE = ScreenHandlerRegistry.registerSimple(new Identifier("consistency_plus", "gui"), (syncId, inventory) -> new BlockCrafterGuiDescription(BLOCK_CRAFTER_GUI_SCREEN_HANDLER_TYPE, syncId, inventory));
        // register Block Crafter block entity
        BLOCK_CRAFTER_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "consistency_plus:block_crafter_entity", BlockEntityType.Builder.create(BlockCrafterEntity::new, BLOCK_CRAFTER).build(null));
        Blocks.init();
        Items.init();
        //Items_new.init(); // for testing

        Registry.register(Registry.ITEM, new Identifier("consistency_plus", "warped_nether_wart"), WARPED_NETHER_WART);
    }
}
