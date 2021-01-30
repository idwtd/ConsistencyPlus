package net.consistencyteam.consistency_plus.BlockCrafter;

import net.consistencyteam.consistency_plus.ConsistencyPlus;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import static net.consistencyteam.consistency_plus.ConsistencyPlus.BLOCK_CRAFTER_GUI_SCREEN_HANDLER_TYPE;

public class BlockCrafterEntity extends BlockEntity {

    public BlockCrafterEntity() {
        super(ConsistencyPlus.BLOCK_CRAFTER_ENTITY);
    }

}
