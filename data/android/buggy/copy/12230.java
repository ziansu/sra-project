@java.lang.Override
public int getMaxEnergyStored(net.minecraftforge.common.util.ForgeDirection from) {
    if ((getCore()) != null) {
        com.pauljoda.modularsystems.generator.tiles.TileGeneratorCore core = ((com.pauljoda.modularsystems.generator.tiles.TileGeneratorCore) (getCore()));
        return core.getMaxEnergyStored(from);
    }
    return 0;
}