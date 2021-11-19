public void delete() {
    assertAllocated();
    org.fusesource.leveldbjni.internal.NativeIterator.IteratorJNI.delete(self);
    self = 0;
}