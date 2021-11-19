@java.lang.Override
public void loadNBTData(net.minecraft.nbt.NBTTagCompound compound) {
    net.minecraft.nbt.NBTTagCompound nbt = ((net.minecraft.nbt.NBTTagCompound) (compound.getTag(com.thexfactor117.levels.handlers.ExtendedMob.EXTENDED_PROPERTIES)));
    this.level = com.thexfactor117.levels.helpers.EnemyLevel.getEnemyLevel(nbt);
}