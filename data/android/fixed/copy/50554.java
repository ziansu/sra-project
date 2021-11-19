public net.minecraftforge.fluids.FluidStack getUsableFluid() {
    if ((fluid) == null) {
        return null;
    }
    net.minecraftforge.fluids.FluidStack stack = this.fluid.copy();
    stack.amount -= locked;
    return stack;
}