package dev.intelligentcreations.glassware.common.creativeTab

import dev.intelligentcreations.glassware.common.block.BlockInit
import net.minecraft.world.item.{CreativeModeTab, ItemStack}

object GroupInit {
  val glasswareMain: CreativeModeTab = new CreativeModeTab("glassware_main") {
    override def makeIcon = new ItemStack(BlockInit.glassStairs.get)
  }
}
