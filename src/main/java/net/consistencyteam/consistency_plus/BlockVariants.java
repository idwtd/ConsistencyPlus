package net.consistencyteam.consistency_plus;

import net.consistencyteam.consistency_plus.BlockCrafter.BlockCrafterBlockVariant;

import static net.consistencyteam.consistency_plus.Blocks.*;
import static net.minecraft.block.Blocks.*;

public class BlockVariants {
    BlockCrafterBlockVariant BlockSlab = new BlockCrafterBlockVariant(STONE_SLAB, true, false);
    BlockCrafterBlockVariant BlockStairs = new BlockCrafterBlockVariant(STONE_STAIRS, true, false);
    BlockCrafterBlockVariant BlockWall = new BlockCrafterBlockVariant(STONE_WALL, true, false);
    BlockCrafterBlockVariant SmoothBlock = new BlockCrafterBlockVariant(SMOOTH_STONE, true, false);
    BlockCrafterBlockVariant SmoothBlockSlab = new BlockCrafterBlockVariant(SMOOTH_STONE_SLAB, true, false);
    BlockCrafterBlockVariant SmoothBlockStairs = new BlockCrafterBlockVariant(SMOOTH_STONE_STAIRS, true, false);
    BlockCrafterBlockVariant SmoothBlockWall = new BlockCrafterBlockVariant(SMOOTH_STONE_WALL, true, false);
    BlockCrafterBlockVariant PolishedBlock = new BlockCrafterBlockVariant(POLISHED_STONE, true, false);
    BlockCrafterBlockVariant PolishedBlockSlab = new BlockCrafterBlockVariant(POLISHED_STONE_SLAB, true, false);
    BlockCrafterBlockVariant PolishedBlockStairs = new BlockCrafterBlockVariant(POLISHED_STONE_STAIRS, true, false);
    BlockCrafterBlockVariant PolishedBlockWall = new BlockCrafterBlockVariant(POLISHED_STONE_WALL, true, false);
}