package net.consistencyteam.consistency_plus;

import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import net.consistencyteam.consistency_plus.BlockCrafter.BlockCrafterGuiDescription;
import net.consistencyteam.consistency_plus.BlockCrafter.BlockCrafterScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

public class ConsistencyPlusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.<BlockCrafterGuiDescription, CottonInventoryScreen<BlockCrafterGuiDescription>>register(ConsistencyPlus.BLOCK_CRAFTER_GUI_SCREEN_HANDLER_TYPE, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));
    }                                                                                                                                                                                    //(gui, inventory.player, title)
}
