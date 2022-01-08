package dev.intelligentcreations.glassware.common.block

import dev.intelligentcreations.glassware.common.block.base.{GlassSlabBlock, GlassStairBlock, StainedGlassSlabBlock, StainedGlassStairBlock}
import dev.intelligentcreations.glassware.common.creativeTab.GroupInit
import dev.intelligentcreations.glassware.common.util.RegistryHandler
import net.minecraft.world.item.Item.Properties
import net.minecraft.world.item.{BlockItem, DyeColor}
import net.minecraft.world.level.block.Block
import net.minecraftforge.registries.RegistryObject

object BlockInit {
  //names
  val SST = "_stained_glass_stairs"
  val SSL = "_stained_glass_slab"
  val WHITE = "white"
  val ORANGE = "orange"
  val MAGENTA = "magenta"
  val L_BLUE = "light_blue"
  val YELLOW = "yellow"
  val LIME = "lime"
  val PINK = "pink"
  val GRAY = "gray"
  val L_GRAY = "light_gray"
  val CYAN = "cyan"
  val PURPLE = "purple"
  val BLUE = "blue"
  val BROWN = "brown"
  val GREEN = "green"
  val RED = "red"
  val BLACK = "black"

  var glassSlab: RegistryObject[Block] = _
  var glassStairs: RegistryObject[Block] = _

  var whiteStainedGlassSlab: RegistryObject[Block] = _
  var orangeStainedGlassSlab: RegistryObject[Block] = _
  var magentaStainedGlassSlab: RegistryObject[Block] = _
  var lightBlueStainedGlassSlab: RegistryObject[Block] = _
  var yellowStainedGlassSlab: RegistryObject[Block] = _
  var limeStainedGlassSlab: RegistryObject[Block] = _
  var pinkStainedGlassSlab: RegistryObject[Block] = _
  var grayStainedGlassSlab: RegistryObject[Block] = _
  var lightGrayStainedGlassSlab: RegistryObject[Block] = _
  var cyanStainedGlassSlab: RegistryObject[Block] = _
  var purpleStainedGlassSlab: RegistryObject[Block] = _
  var blueStainedGlassSlab: RegistryObject[Block] = _
  var brownStainedGlassSlab: RegistryObject[Block] = _
  var greenStainedGlassSlab: RegistryObject[Block] = _
  var redStainedGlassSlab: RegistryObject[Block] = _
  var blackStainedGlassSlab: RegistryObject[Block] = _

  var whiteStainedGlassStairs: RegistryObject[Block] = _
  var orangeStainedGlassStairs: RegistryObject[Block] = _
  var magentaStainedGlassStairs: RegistryObject[Block] = _
  var lightBlueStainedGlassStairs: RegistryObject[Block] = _
  var yellowStainedGlassStairs: RegistryObject[Block] = _
  var limeStainedGlassStairs: RegistryObject[Block] = _
  var pinkStainedGlassStairs: RegistryObject[Block] = _
  var grayStainedGlassStairs: RegistryObject[Block] = _
  var lightGrayStainedGlassStairs: RegistryObject[Block] = _
  var cyanStainedGlassStairs: RegistryObject[Block] = _
  var purpleStainedGlassStairs: RegistryObject[Block] = _
  var blueStainedGlassStairs: RegistryObject[Block] = _
  var brownStainedGlassStairs: RegistryObject[Block] = _
  var greenStainedGlassStairs: RegistryObject[Block] = _
  var redStainedGlassStairs: RegistryObject[Block] = _
  var blackStainedGlassStairs: RegistryObject[Block] = _

  //blocks
  final def register(): Unit = {
    glassSlab = RegistryHandler.Blocks.register("glass_slab",() => new GlassSlabBlock)
    whiteStainedGlassSlab = initStainedGlassBlock(WHITE, DyeColor.WHITE, isStairs = false)
    orangeStainedGlassSlab = initStainedGlassBlock(ORANGE, DyeColor.ORANGE, isStairs = false)
    magentaStainedGlassSlab = initStainedGlassBlock(MAGENTA, DyeColor.MAGENTA, isStairs = false)
    lightBlueStainedGlassSlab = initStainedGlassBlock(L_BLUE, DyeColor.LIGHT_BLUE, isStairs = false)
    yellowStainedGlassSlab = initStainedGlassBlock(YELLOW, DyeColor.YELLOW, isStairs = false)
    limeStainedGlassSlab = initStainedGlassBlock(LIME, DyeColor.LIME, isStairs = false)
    pinkStainedGlassSlab = initStainedGlassBlock(PINK, DyeColor.PINK, isStairs = false)
    grayStainedGlassSlab = initStainedGlassBlock(GRAY, DyeColor.GRAY, isStairs = false)
    lightGrayStainedGlassSlab = initStainedGlassBlock(L_GRAY, DyeColor.LIGHT_GRAY, isStairs = false)
    cyanStainedGlassSlab = initStainedGlassBlock(CYAN, DyeColor.CYAN, isStairs = false)
    purpleStainedGlassSlab = initStainedGlassBlock(PURPLE, DyeColor.PURPLE, isStairs = false)
    blueStainedGlassSlab = initStainedGlassBlock(BLUE, DyeColor.BLUE, isStairs = false)
    brownStainedGlassSlab = initStainedGlassBlock(BROWN, DyeColor.BROWN, isStairs = false)
    greenStainedGlassSlab = initStainedGlassBlock(GREEN, DyeColor.GREEN, isStairs = false)
    redStainedGlassSlab = initStainedGlassBlock(RED, DyeColor.RED, isStairs = false)
    blackStainedGlassSlab = initStainedGlassBlock(BLACK, DyeColor.BLACK, isStairs = false)
    glassStairs = RegistryHandler.Blocks.register("glass_stairs",() => new GlassStairBlock)
    whiteStainedGlassStairs = initStainedGlassBlock(WHITE, DyeColor.WHITE, isStairs = true)
    orangeStainedGlassStairs = initStainedGlassBlock(ORANGE, DyeColor.ORANGE, isStairs = true)
    magentaStainedGlassStairs = initStainedGlassBlock(MAGENTA, DyeColor.MAGENTA, isStairs = true)
    lightBlueStainedGlassStairs = initStainedGlassBlock(L_BLUE, DyeColor.LIGHT_BLUE, isStairs = true)
    yellowStainedGlassStairs = initStainedGlassBlock(YELLOW, DyeColor.YELLOW, isStairs = true)
    limeStainedGlassStairs = initStainedGlassBlock(LIME, DyeColor.LIME, isStairs = true)
    pinkStainedGlassStairs = initStainedGlassBlock(PINK, DyeColor.PINK, isStairs = true)
    grayStainedGlassStairs = initStainedGlassBlock(GRAY, DyeColor.GRAY, isStairs = true)
    lightGrayStainedGlassStairs = initStainedGlassBlock(L_GRAY, DyeColor.LIGHT_GRAY, isStairs = true)
    cyanStainedGlassStairs = initStainedGlassBlock(CYAN, DyeColor.CYAN, isStairs = true)
    purpleStainedGlassStairs = initStainedGlassBlock(PURPLE, DyeColor.PURPLE, isStairs = true)
    blueStainedGlassStairs = initStainedGlassBlock(BLUE, DyeColor.BLUE, isStairs = true)
    brownStainedGlassStairs = initStainedGlassBlock(BROWN, DyeColor.BROWN, isStairs = true)
    greenStainedGlassStairs = initStainedGlassBlock(GREEN, DyeColor.GREEN, isStairs = true)
    redStainedGlassStairs = initStainedGlassBlock(RED, DyeColor.RED, isStairs = true)
    blackStainedGlassStairs = initStainedGlassBlock(BLACK, DyeColor.BLACK, isStairs = true)
    RegistryHandler.Items.register("glass_slab", () => new BlockItem(glassSlab.get(), new Properties().tab(GroupInit.glasswareMain)))
    initBlockItem(WHITE, whiteStainedGlassSlab, isStairs = false)
    initBlockItem(ORANGE, orangeStainedGlassSlab, isStairs = false)
    initBlockItem(MAGENTA, magentaStainedGlassSlab, isStairs = false)
    initBlockItem(L_BLUE, lightBlueStainedGlassSlab, isStairs = false)
    initBlockItem(YELLOW, yellowStainedGlassSlab, isStairs = false)
    initBlockItem(LIME, limeStainedGlassSlab, isStairs = false)
    initBlockItem(PINK, pinkStainedGlassSlab, isStairs = false)
    initBlockItem(GRAY, grayStainedGlassSlab, isStairs = false)
    initBlockItem(L_GRAY, lightGrayStainedGlassSlab, isStairs = false)
    initBlockItem(CYAN, cyanStainedGlassSlab, isStairs = false)
    initBlockItem(PURPLE, purpleStainedGlassSlab, isStairs = false)
    initBlockItem(BLUE, blueStainedGlassSlab, isStairs = false)
    initBlockItem(BROWN, brownStainedGlassSlab, isStairs = false)
    initBlockItem(GREEN, greenStainedGlassSlab, isStairs = false)
    initBlockItem(RED, redStainedGlassSlab, isStairs = false)
    initBlockItem(BLACK, blackStainedGlassSlab, isStairs = false)
    RegistryHandler.Items.register("glass_stairs", () => new BlockItem(glassStairs.get(), new Properties().tab(GroupInit.glasswareMain)))
    initBlockItem(WHITE, whiteStainedGlassStairs, isStairs = true)
    initBlockItem(ORANGE, orangeStainedGlassStairs, isStairs = true)
    initBlockItem(MAGENTA, magentaStainedGlassStairs, isStairs = true)
    initBlockItem(L_BLUE, lightBlueStainedGlassStairs, isStairs = true)
    initBlockItem(YELLOW, yellowStainedGlassStairs, isStairs = true)
    initBlockItem(LIME, limeStainedGlassStairs, isStairs = true)
    initBlockItem(PINK, pinkStainedGlassStairs, isStairs = true)
    initBlockItem(GRAY, grayStainedGlassStairs, isStairs = true)
    initBlockItem(L_GRAY, lightGrayStainedGlassStairs, isStairs = true)
    initBlockItem(CYAN, cyanStainedGlassStairs, isStairs = true)
    initBlockItem(PURPLE, purpleStainedGlassStairs, isStairs = true)
    initBlockItem(BLUE, blueStainedGlassStairs, isStairs = true)
    initBlockItem(BROWN, brownStainedGlassStairs, isStairs = true)
    initBlockItem(GREEN, greenStainedGlassStairs, isStairs = true)
    initBlockItem(RED, redStainedGlassStairs, isStairs = true)
    initBlockItem(BLACK, blackStainedGlassStairs, isStairs = true)
  }
  final def initStainedGlassBlock(color:String, dyeColor: DyeColor, isStairs:Boolean): RegistryObject[Block] = {
    if (isStairs) RegistryHandler.Blocks.register(color+SST,
      () => new StainedGlassStairBlock(dyeColor))
    else RegistryHandler.Blocks.register(color+SSL,
      () => new StainedGlassSlabBlock(dyeColor))
  }

  final def initBlockItem(color:String, block: RegistryObject[Block], isStairs: Boolean): RegistryObject[BlockItem] = {
    val blockType = if(isStairs) SST else SSL
    RegistryHandler.Items.register(color+blockType,
      () => new BlockItem(block.get(), new Properties().tab(GroupInit.glasswareMain)))
  }
}
