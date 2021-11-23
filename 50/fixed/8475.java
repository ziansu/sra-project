@java.lang.Override
public final net.minecraft.nbt.NBTTagCompound writeToNBT(net.minecraft.nbt.NBTTagCompound root) {
    root = super.writeToNBT(root);
    writeCustomNBT(root);
    return root;
}