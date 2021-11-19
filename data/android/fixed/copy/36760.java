private boolean isValid(net.minecraft.util.BlockPos pos) {
    if (!(blockInBounds(pos, this.arenaBounds)))
        return false;
    
    if (this.path.contains(pos))
        return false;
    
    return true;
}