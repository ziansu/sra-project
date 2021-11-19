public static void loadBlocks() {
    com.xplosivesnet.explochem.xplosivesnet_blocks.reactionVessel = new com.xplosivesnet.explochem.devices.reactionVessel();
    cpw.mods.fml.common.registry.GameRegistry.registerBlock(com.xplosivesnet.explochem.xplosivesnet_blocks.reactionVessel, "reactionVessel");
    com.xplosivesnet.explochem.xplosivesnet_generation ore_gen = new com.xplosivesnet.explochem.xplosivesnet_generation();
    cpw.mods.fml.common.registry.GameRegistry.registerWorldGenerator(ore_gen, 0);
}