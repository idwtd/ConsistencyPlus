package net.consistencyteam.consistency_plus.BlockCrafter;

import io.github.cottonmc.cotton.gui.SyncedGuiDescription;
import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import net.minecraft.entity.player.PlayerEntity;

public class BlockCrafterScreen extends CottonInventoryScreen {
    public BlockCrafterScreen(SyncedGuiDescription description, PlayerEntity player) {
        super(description, player);
    }
}
