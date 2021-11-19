public static boolean isMekanismPresent() {
    if (cpw.mods.fml.common.Loader.isModLoaded(ModLib.MEKANISM)) {
        return true;
    }
    return false;
}