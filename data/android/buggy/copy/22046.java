@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public void forceFillTank(net.minecraftforge.fluids.FluidStack stack) {
    this.fluidInv = stack.copy();
}