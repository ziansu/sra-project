@java.lang.Override
public int height() {
    if ((size) == 0) {
        return -1;
    }
    return root.getHeight();
}