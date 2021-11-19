@com.sun.istack.internal.Nullable
public E last() {
    if ((root) == null) {
        return null;
    }
    return root.mostRight().data;
}