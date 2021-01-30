package net.consistencyteam.consistency_plus.BlockCrafter;

import io.github.cottonmc.cotton.gui.SyncedGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WItemSlot;
import net.consistencyteam.consistency_plus.ConsistencyPlus;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;

public class BlockCrafterGuiDescription extends SyncedGuiDescription {

    public BlockCrafterGuiDescription(ScreenHandlerType<?> type, int syncId, PlayerInventory playerInventory) {
        super(type, syncId, playerInventory);
    }

}
