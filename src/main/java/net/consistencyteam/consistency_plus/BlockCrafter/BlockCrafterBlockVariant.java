package net.consistencyteam.consistency_plus.BlockCrafter;

import io.github.cottonmc.cotton.gui.widget.WWidget;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.client.util.math.MatrixStack;

public class BlockCrafterBlockVariant extends WWidget {

    public BlockCrafterBlockVariant(Block block, Boolean base, Boolean stackable) {

    }

    @Override
    public boolean canResize() {
        return true; // set to false if you want a static size
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void paint(MatrixStack matrices, int x, int y, int mouseX, int mouseY) {
        // This is the most important method of a custom widget, where you decide how it'll look.
    }

}
