@java.lang.Override
public void addAll(java.io.File key, java.util.Collection<? extends java.io.File> newVals) {
    java.util.Collection<java.io.File> vals = get(key);
    vals.addAll(newVals);
    set(key, vals);
}