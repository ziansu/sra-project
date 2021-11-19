private void setRedstoneState() {
    markDirty();
    worldObj.notifyNeighborsOfStateChange(this.pos, this.getBlockType());
}