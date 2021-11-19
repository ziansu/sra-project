public static int insertFluid(net.minecraftforge.fluids.FluidStack fluid, net.minecraft.item.ItemStack container) {
    net.minecraftforge.fluids.capability.IFluidHandler handler = net.minecraftforge.fluids.FluidUtil.getFluidHandler(container);
    if (fluid == null) {
        return 0;
    }
    return handler.fill(fluid, true);
}