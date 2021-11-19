@java.lang.Override
public void clear() {
    if (!(decorated.isEmpty())) {
        decorated.clear();
        dirtyFlag.set(true);
    }
}