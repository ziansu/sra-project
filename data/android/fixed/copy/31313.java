@java.lang.Override
public void readFromNBT(@org.jetbrains.annotations.NotNull
final net.minecraft.nbt.NBTTagCompound compound) {
    super.readFromNBT(compound);
    barracks = net.minecraft.nbt.NBTUtil.getPosFromTag(compound);
}