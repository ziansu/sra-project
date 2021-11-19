@java.lang.Override
public void registerBlockModel() {
    org.halvors.nuclearphysics.common.NuclearPhysics.getProxy().registerBlockRenderer(this, new net.minecraft.client.renderer.block.statemap.StateMap.Builder().withName(BlockStateElectromagnet.TYPE).withSuffix(("_" + (name))).build());
}