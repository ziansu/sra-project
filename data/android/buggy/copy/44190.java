public void sendBlockUpdate() {
    if (!(world.isRemote)) {
        world.notifyBlockUpdate(pos, world.getBlockState(pos), world.getBlockState(pos), 8);
        markDirty();
    }
}