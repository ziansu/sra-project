@java.lang.Override
public void clear() {
    ++(mutationCount);
    ++(size);
    root = null;
}