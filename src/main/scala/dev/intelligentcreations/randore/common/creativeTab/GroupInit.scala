package dev.intelligentcreations.randore.common.creativeTab

import dev.intelligentcreations.randore.common.block.BlockInit
import net.minecraft.world.item.{CreativeModeTab, ItemStack}

object GroupInit {
  val glasswareMain: CreativeModeTab = new CreativeModeTab("glassware_main") {
    override def makeIcon = new ItemStack(BlockInit.glassStairs.get)
  }
}
