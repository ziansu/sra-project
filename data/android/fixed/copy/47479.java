@java.lang.Override
public void registerBlockModel() {
    org.halvors.nuclearphysics.common.NuclearPhysics.getProxy().registerBlockRenderer(this, BlockStateElectromagnet.TYPE, name);
}