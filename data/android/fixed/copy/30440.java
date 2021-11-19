@java.lang.Override
public boolean contains(java.lang.Object o) {
    if ((nmsNbtList) == null)
        return false;
    
    return nmsNbtList.contains(fr.zcraft.zlib.tools.nbt.NBT.fromNativeValue(o));
}