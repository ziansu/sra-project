public void setTarget(net.minecraft.util.BlockPos position) {
    moveTo(position.subtract(origin), 0, worldS);
}