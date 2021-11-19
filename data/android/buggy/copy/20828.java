@java.lang.Override
public void deserializeNBT(net.minecraft.nbt.NBTBase nbt) {
    com.bte.mod.capability.ChargeProvider.CHARGE_CAPABILITY.getStorage().readNBT(com.bte.mod.capability.ChargeProvider.CHARGE_CAPABILITY, this.instance, null, nbt);
}