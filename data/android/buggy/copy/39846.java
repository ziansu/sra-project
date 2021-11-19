private void registerFuel(net.minecraftforge.fluids.Fluid fluid) {
    registerFuel(fluid, 60, ((pneumaticCraft.common.PneumaticCraftAPIHandler.getInstance().liquidFuels.get(fluid)) / 60));
}