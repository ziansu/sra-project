@java.lang.Override
public void addAll(java.io.File key, java.util.Collection<? extends java.io.File> newVals) {
    java.util.Set<java.io.File> vals = new java.util.HashSet<>(get(key));
    vals.addAll(newVals);
    set(key, vals);
}