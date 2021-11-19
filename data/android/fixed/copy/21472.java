private static void setupChestLoot(java.lang.String category) {
    if ((mcjty.rftools.blocks.dimlets.DimletConfiguration.unknownDimletChestLootRarity) > 0) {
        net.minecraftforge.common.ChestGenHooks chest = net.minecraftforge.common.ChestGenHooks.getInfo(category);
        chest.addItem(new net.minecraft.util.WeightedRandomChestContent(mcjty.rftools.blocks.dimlets.DimletSetup.unknownDimlet, 0, mcjty.rftools.blocks.dimlets.DimletConfiguration.unknownDimletChestLootMinimum, mcjty.rftools.blocks.dimlets.DimletConfiguration.unknownDimletChestLootMaximum, mcjty.rftools.blocks.dimlets.DimletConfiguration.unknownDimletChestLootRarity));
    }
}