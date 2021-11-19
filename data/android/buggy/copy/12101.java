@java.lang.Override
public java.lang.Short value() {
    if (mem != null) {
        return mem.freePercent();
    }
    return -1;
}