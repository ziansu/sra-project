org.cojen.tupl.TreeCursorFrame pop() {
    unbind(null);
    org.cojen.tupl.TreeCursorFrame parent = mParentFrame;
    mNode = null;
    mParentFrame = null;
    mNotFoundKey = null;
    return parent;
}