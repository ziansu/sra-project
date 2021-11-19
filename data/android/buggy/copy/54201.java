boolean isSubtypeOf(com.google.javascript.jscomp.newtypes.ObjectKind other) {
    return (mask) == ((mask) & (other.mask));
}