@com.sun.istack.internal.Nullable
public E first() {
    if ((root) == null) {
        return null;
    }
    return root.mostLeft().data;
}