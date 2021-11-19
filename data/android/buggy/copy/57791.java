private byte addClass(final java.lang.Class<?> clazz, final byte eid) {
    classesToIdx.put(clazz, eid);
    idxToClasses.put(eid, clazz);
    return eid;
}