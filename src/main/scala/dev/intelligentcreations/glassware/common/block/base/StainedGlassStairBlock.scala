package dev.intelligentcreations.glassware.common.block.base

import net.minecraft.world.item.DyeColor
import net.minecraft.world.level.block.BeaconBeamBlock

class StainedGlassStairBlock(color:DyeColor) extends GlassStairBlock with BeaconBeamBlock{
  override def getColor: DyeColor = color
}
