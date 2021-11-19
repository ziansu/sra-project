@Optional.Method(modid = "IC2")
protected void removeFromIc2EnergyNetwork() {
    ic2.api.energy.event.EnergyTileUnloadEvent event = new ic2.api.energy.event.EnergyTileUnloadEvent(this);
    MinecraftForge.EVENT_BUS.post(event);
}