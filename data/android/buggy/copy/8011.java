@java.lang.Override
public net.minecraft.nbt.NBTBase serializeNBT() {
    return com.bte.mod.capability.ChargeProvider.CHARGE_CAPABILITY.getStorage().writeNBT(com.bte.mod.capability.ChargeProvider.CHARGE_CAPABILITY, this.instance, null);
}