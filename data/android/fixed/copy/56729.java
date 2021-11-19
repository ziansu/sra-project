@java.lang.Override
public int getEnergyStored(net.minecraft.item.ItemStack container) {
    if (container != null) {
        return container.stackTagCompound.getInteger("energy");
    }else {
        return 0;
    }
}