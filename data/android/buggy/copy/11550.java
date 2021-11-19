public void onLoaded() {
    if (!(this.worldObj.isRemote)) {
        this.addedToEnergyNet = !(MinecraftForge.EVENT_BUS.post(new ic2.api.energy.event.EnergyTileLoadEvent(this)));
    }
    this.loaded = true;
}