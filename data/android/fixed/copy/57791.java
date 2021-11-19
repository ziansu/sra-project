private void addClass(final java.lang.Class<?> clazz, final short eid) {
    classesToIdx.put(clazz, eid);
    idxToClasses.put(eid, clazz);
}