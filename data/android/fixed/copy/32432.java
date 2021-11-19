public byte get(int index) {
    return com.questdb.misc.Unsafe.getUnsafe().getByte(address0(index));
}