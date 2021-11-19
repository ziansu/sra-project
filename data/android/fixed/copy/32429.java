@java.lang.Override
public boolean hasCapability(net.minecraftforge.common.capabilities.Capability<?> capability, net.minecraft.util.EnumFacing facing) {
    if (capability == (net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY))
        return true;
    
    return super.hasCapability(capability, facing);
}