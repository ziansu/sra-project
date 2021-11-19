private static void getItems() {
    magicbees.main.utils.compat.RedstoneArsenalHelper.fluxNugget = magicbees.main.utils.ItemInterface.getItemStack(magicbees.main.utils.compat.RedstoneArsenalHelper.Name.toLowerCase(), "nuggetElectrumFlux");
    if ((magicbees.main.utils.compat.RedstoneArsenalHelper.fluxNugget) == null) {
        throw new java.lang.RuntimeException((("Can't find " + (magicbees.main.utils.compat.RedstoneArsenalHelper.Name)) + ".nuggetElectrumFlux"));
    }
}