private java.lang.Object readResolve() {
    threadGroups = new java.util.LinkedList<>();
    return this;
}