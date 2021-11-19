@java.lang.Override
public void writeToNBT(net.minecraft.nbt.NBTTagCompound par1) {
    super.writeToNBT(par1);
    par1.setString("Owner", owner);
}