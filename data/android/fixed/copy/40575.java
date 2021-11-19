public final int getValueBytesFromId(int id, byte[] returnValue, int offset) {
    if (isNullId(id))
        return -1;
    else
        return getValueBytesFromIdImpl(id, returnValue, offset);
    
}