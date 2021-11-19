@java.lang.Override
public int getEnergyStored(net.minecraft.item.ItemStack container) {
    return container.stackTagCompound.getInteger("energy");
}