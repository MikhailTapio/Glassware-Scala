package dev.intelligentcreations.glassware.common.util

import dev.intelligentcreations.glassware.common.Glassware
import dev.intelligentcreations.glassware.common.block.BlockInit
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext
import net.minecraftforge.registries.{DeferredRegister, ForgeRegistries}

object RegistryHandler {
  val Blocks: DeferredRegister[Block] = DeferredRegister.create(ForgeRegistries.BLOCKS, Glassware.MOD_ID)
  val Items: DeferredRegister[Item] = DeferredRegister.create(ForgeRegistries.ITEMS, Glassware.MOD_ID)
  val eventBus: IEventBus = FMLJavaModLoadingContext.get().getModEventBus
  final def register(): Unit = {
    BlockInit.register()
    Blocks.register(eventBus)
    Items.register(eventBus)
  }
}
