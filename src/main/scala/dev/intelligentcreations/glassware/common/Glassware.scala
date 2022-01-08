package dev.intelligentcreations.glassware.common

import dev.intelligentcreations.glassware.common.util.RegistryHandler
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Mod

@Mod(Glassware.MOD_ID)
object Glassware {
  final val MOD_ID = "glassware"
  RegistryHandler.register()
  MinecraftForge.EVENT_BUS.register(this)
}
