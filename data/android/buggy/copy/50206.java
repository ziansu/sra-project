public void setTotemType(int totemType) {
    net.minecraftforge.fml.common.FMLLog.log(Level.WARN, ("setTotemType: " + totemType));
    mTotemType = totemType;
    markForUpdate();
}