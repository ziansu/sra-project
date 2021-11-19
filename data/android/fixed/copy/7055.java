@java.lang.Override
public boolean isLazy() {
    if ((isLazy) == null) {
        isLazy = usesIndirection();
    }
    return isLazy;
}