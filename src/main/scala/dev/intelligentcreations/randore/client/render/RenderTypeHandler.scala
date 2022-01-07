package dev.intelligentcreations.randore.client.render

import dev.intelligentcreations.randore.common.block.BlockInit
import net.minecraft.client.renderer.{ItemBlockRenderTypes, RenderType}
import net.minecraftforge.api.distmarker.Dist
import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Array(Dist.CLIENT))
object RenderTypeHandler {
  @SubscribeEvent def onRenderTypeSetup(event: FMLClientSetupEvent): Unit ={
    event.enqueueWork(new Runnable {
      override def run(): Unit = {
        ItemBlockRenderTypes.setRenderLayer(BlockInit.glassSlab.get(), RenderType.cutout())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.glassStairs.get(), RenderType.cutout())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.whiteStainedGlassStairs.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.orangeStainedGlassStairs.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.magentaStainedGlassStairs.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.lightBlueStainedGlassStairs.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.yellowStainedGlassStairs.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.limeStainedGlassStairs.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.pinkStainedGlassStairs.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.grayStainedGlassStairs.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.lightGrayStainedGlassStairs.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.cyanStainedGlassStairs.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.purpleStainedGlassStairs.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.blueStainedGlassStairs.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.brownStainedGlassStairs.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.greenStainedGlassStairs.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.redStainedGlassStairs.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.blackStainedGlassStairs.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.whiteStainedGlassSlab.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.orangeStainedGlassSlab.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.magentaStainedGlassSlab.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.lightBlueStainedGlassSlab.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.yellowStainedGlassSlab.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.limeStainedGlassSlab.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.pinkStainedGlassSlab.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.grayStainedGlassSlab.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.lightGrayStainedGlassSlab.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.cyanStainedGlassSlab.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.purpleStainedGlassSlab.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.blueStainedGlassSlab.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.brownStainedGlassSlab.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.greenStainedGlassSlab.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.redStainedGlassSlab.get(), RenderType.translucent())
        ItemBlockRenderTypes.setRenderLayer(BlockInit.blackStainedGlassSlab.get(), RenderType.translucent())
      }
    })
  }
}
