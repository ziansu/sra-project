@java.lang.Override
public void saveNBTData(final net.minecraft.nbt.NBTTagCompound aNBT) {
    aNBT.setInteger("mFrequency", this.mFrequency);
    if ((mOwner) != null)
        aNBT.setString("mOwner", mOwner.toString());
    
}