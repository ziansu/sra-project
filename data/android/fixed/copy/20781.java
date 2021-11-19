boolean isStruct() {
    return ((this.mask) & (com.google.javascript.jscomp.newtypes.ObjectKind.STRUCT_MASK)) != 0;
}