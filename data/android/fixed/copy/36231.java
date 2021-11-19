@java.lang.SuppressWarnings(value = "unchecked")
@javax.annotation.Nullable
@java.lang.Override
public <T> T getCapability(@javax.annotation.Nonnull
net.minecraftforge.common.capabilities.Capability<T> capability, @javax.annotation.Nullable
net.minecraft.util.EnumFacing facing) {
    return capability == (com.alesharik.gearsmod.capability.smoke.SmokeCapability.DEFAULT_CAPABILITY) ? ((T) (smokeHandler)) : super.getCapability(capability, facing);
}