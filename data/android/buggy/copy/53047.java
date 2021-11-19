public boolean add(net.launcher.game.nbt.NBT base) {
    if ((base.getType()) == (NBTType.NULL))
        return false;
    
    return (validate(base)) && (list.add(base));
}