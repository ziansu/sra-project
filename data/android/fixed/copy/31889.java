public static int insertFluid(net.minecraftforge.fluids.FluidStack fluid, net.minecraftforge.fluids.capability.IFluidHandler handler) {
    if ((fluid == null) || (handler == null)) {
        return 0;
    }
    return handler.fill(fluid, true);
}