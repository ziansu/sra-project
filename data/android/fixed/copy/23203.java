public final void reset() {
    if ((refer) != null) {
        refer.reset();
    }
    classref.clear();
    lastclassref = 0;
}