package dev.intelligentcreations.randore.common.block.base

import net.minecraft.core.{BlockPos, Direction}
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.BlockGetter
import net.minecraft.world.level.block.state.{BlockBehaviour, BlockState}
import net.minecraft.world.level.block.{SlabBlock, SoundType}
import net.minecraft.world.level.material.Material
import net.minecraft.world.level.storage.loot.LootContext
import net.minecraft.world.phys.shapes.{CollisionContext, Shapes, VoxelShape}

import java.util
import java.util.Collections

class GlassSlabBlock extends SlabBlock(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS).strength(1f, 2f).noOcclusion().isRedstoneConductor((_: BlockState, _: BlockGetter, _: BlockPos) => false)){
  override def getDrops(state: BlockState, builder: LootContext.Builder): util.List[ItemStack] = {
    Collections.singletonList(new ItemStack(this, 1))
  }

  override def getVisualShape(state:BlockState, getter: BlockGetter, pos: BlockPos, ctx: CollisionContext):
  VoxelShape = {
    Shapes.empty
  }

  override def getShadeBrightness(state: BlockState, getter: BlockGetter, pos: BlockPos):
  Float = {
    1.0F
  }

  override def propagatesSkylightDown(state: BlockState, getter: BlockGetter, pos: BlockPos):
  Boolean = {
    true
  }

  override def skipRendering(state1: BlockState, state2: BlockState, direction: Direction):
  Boolean = {
    if (state2.is(this)) true
    else super.skipRendering(state1, state2, direction)
  }

  override def useShapeForLightOcclusion(blockState: BlockState):Boolean = {
    true
  }
}