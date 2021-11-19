private void setSwitchedOn(boolean switchedOn) {
    this.switchedOn = switchedOn;
    ModBlocks.pedestal.setEnabled(worldObj, pos, switchedOn);
}