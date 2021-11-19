public void registerBlocks() {
    for (net.minecraftforge.fluids.Fluid fluid : com.builtbroken.mc.fluids.fluid.FluidHelper.generatedFluids) {
        com.builtbroken.mc.fluids.fluid.FluidHelper.createBlockForFluidIfMissing(fluid);
    }
}