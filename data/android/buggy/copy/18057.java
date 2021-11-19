@Optional.Method(modid = "IC2")
public void addToIc2EnergyNetwork() {
    if (!(worldObj.isRemote)) {
        ic2.api.energy.event.EnergyTileLoadEvent event = new ic2.api.energy.event.EnergyTileLoadEvent(this);
        MinecraftForge.EVENT_BUS.post(event);
    }
}