@java.lang.Override
protected long decrement(int index) {
    return java.lang.Integer.toUnsignedLong((--(counters[index])));
}