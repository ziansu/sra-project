public boolean isDimensionAllowed(net.minecraft.world.World aWorld, int aDimensionType, int exceptedDimension) {
    return (((aDimensionType == 0) || (aDimensionType == (-1))) || (aDimensionType == 1)) || (aDimensionType == exceptedDimension);
}