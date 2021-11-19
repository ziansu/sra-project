@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public static void initModels() {
    c4.comforts.common.blocks.ComfortsBlocks.ROPE.initModel();
    for (c4.comforts.common.blocks.BlockSleepingBag sleepingBag : c4.comforts.common.blocks.ComfortsBlocks.SLEEPING_BAGS) {
        sleepingBag.initModel(ComfortsItems.SLEEPING_BAG);
    }
    for (c4.comforts.common.blocks.BlockHammock hammock : c4.comforts.common.blocks.ComfortsBlocks.HAMMOCKS) {
        hammock.initModel(ComfortsItems.HAMMOCK);
    }
}