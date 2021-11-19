@java.lang.Override
public int extractEnergy(net.minecraftforge.common.util.ForgeDirection from, int maxExtract, boolean simulate) {
    java.lang.System.out.println((("test? Attempting to extract " + maxExtract) + " RF."));
    return storage.extractEnergy(maxExtract, simulate);
}