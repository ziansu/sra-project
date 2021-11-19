public boolean hasCapability(net.minecraftforge.common.capabilities.Capability<?> capability, @javax.annotation.Nullable
net.minecraft.util.EnumFacing facing) {
    if (capability == (net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)) {
        return true;
    }
    return super.hasCapability(capability, facing);
}