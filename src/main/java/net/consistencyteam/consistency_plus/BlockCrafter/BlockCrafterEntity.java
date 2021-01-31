package net.consistencyteam.consistency_plus.BlockCrafter;

import net.consistencyteam.consistency_plus.ConsistencyPlus;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import static net.consistencyteam.consistency_plus.ConsistencyPlus.BLOCK_CRAFTER_GUI_SCREEN_HANDLER_TYPE;

public class BlockCrafterEntity extends BlockEntity implements NamedScreenHandlerFactory, BlockCrafterImplementedInventory, SidedInventory {
// has an inventory that can store 1 item (stack?)
    public final DefaultedList<ItemStack> items = DefaultedList.ofSize(1, ItemStack.EMPTY);

    @Override
    public DefaultedList<ItemStack> getItems() {
        return items;
    }



    // tag based data storage
    @Override
    public void fromTag(BlockState state, CompoundTag tag) {
        super.fromTag(state, tag);
        Inventories.fromTag(tag,items);
    }
    @Override
    public CompoundTag toTag(CompoundTag tag) {
        Inventories.toTag(tag,items);
        return super.toTag(tag);
    }



    // sided inventory
    // left slot input from top, right output below
    @Override
    public int[] getInvAvailableSlots(Direction var1) {
        // Just return an array of all slots
        int[] result = new int[getItems().size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }

        return result;
    }
    @Override
    public boolean canInsert(int slot, ItemStack stack, Direction direction) {
        return direction != Direction.UP;
    }
    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction direction) {
        return true;
    }



    public BlockCrafterEntity() {
        super(ConsistencyPlus.BLOCK_CRAFTER_ENTITY);
    }

    @Override
    public Text getDisplayName() {
        return new LiteralText("Block Crafter");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new BlockCrafterGuiDescription(ConsistencyPlus.BLOCK_CRAFTER_GUI_SCREEN_HANDLER_TYPE, syncId, inv);
    }



}
