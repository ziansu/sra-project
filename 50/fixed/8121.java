@java.lang.Override
public <T> T getCapability(net.minecraftforge.common.capabilities.Capability<T> capability, net.minecraft.util.EnumFacing facing) {
    if (capability == (com.bte.mod.capability.ChargeProvider.CHARGE_CAPABILITY)) {
        return ((T) (instance));
    }
    return null;
}