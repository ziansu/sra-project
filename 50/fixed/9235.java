@java.lang.Override
protected long decrement(int index) {
    if ((counters[index]) == 0)
        return 0;
    
    return java.lang.Byte.toUnsignedLong((--(counters[index])));
}