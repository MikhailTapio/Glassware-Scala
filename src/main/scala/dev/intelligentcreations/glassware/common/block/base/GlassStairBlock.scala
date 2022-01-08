package dev.intelligentcreations.glassware.common.block.base

import net.minecraft.core.{BlockPos, Direction}
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.BlockGetter
import net.minecraft.world.level.block.state.BlockBehaviour.Properties
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.block.{Block, SoundType, StairBlock}
import net.minecraft.world.level.material.Material
import net.minecraft.world.level.storage.loot.LootContext
import net.minecraft.world.phys.shapes.{CollisionContext, Shapes, VoxelShape}

import java.util
import java.util.Collections

class GlassStairBlock extends StairBlock(() => new Block(Properties.of(Material.GLASS).sound(SoundType.GLASS).strength(1f, 2f).noOcclusion.isRedstoneConductor((_: BlockState, _: BlockGetter, _: BlockPos) => false)).defaultBlockState,
  Properties.of(Material.GLASS).sound(SoundType.GLASS).strength(1f, 2f).noOcclusion.isRedstoneConductor ((_: BlockState, _: BlockGetter, _: BlockPos) => false)){

  override def getDrops(state: BlockState, builder: LootContext.Builder):
  util.List[ItemStack] = Collections.singletonList(new ItemStack(this, 1))

  override def getVisualShape(state:BlockState, getter: BlockGetter, pos: BlockPos, ctx: CollisionContext):
  VoxelShape = Shapes.empty

  override def getShadeBrightness(state: BlockState, getter: BlockGetter, pos: BlockPos):
  Float = 1.0F

  override def propagatesSkylightDown(state: BlockState, getter: BlockGetter, pos: BlockPos):
  Boolean = true

  override def skipRendering(state1: BlockState, state2: BlockState, direction: Direction):
  Boolean = state2.is(this)

  override def useShapeForLightOcclusion(blockState: BlockState):
  Boolean = true
}
