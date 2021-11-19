public float getFillPercentage() {
    net.minecraftforge.fluids.FluidStack fluidStack = tank.getFluid();
    if (fluidStack == null)
        return 0;
    
    return ((float) (capacity)) / ((float) (tank.getFluidAmount()));
}