@java.lang.Override
public net.minecraft.nbt.NBTBase serializeNBT() {
    return com.bte.mod.capability.ChargeProvider.CHARGE_CAPABILITY.writeNBT(this.instance, null);
}