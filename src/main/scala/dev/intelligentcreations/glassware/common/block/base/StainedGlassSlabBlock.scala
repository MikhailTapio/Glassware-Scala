package dev.intelligentcreations.glassware.common.block.base

import net.minecraft.world.item.DyeColor
import net.minecraft.world.level.block.BeaconBeamBlock

class StainedGlassSlabBlock(color: DyeColor) extends GlassSlabBlock with BeaconBeamBlock{
  override def getColor: DyeColor = color
}
