public static <T extends net.minecraftforge.fluids.Fluid> T registerFluid(T fluid) {
    fluid.setUnlocalizedName(slimeknights.tconstruct.library.Util.prefix(fluid.getName()));
    net.minecraftforge.fluids.FluidRegistry.registerFluid(fluid);
    slimeknights.tconstruct.shared.TinkerFluids.fluids.add(fluid);
    return fluid;
}