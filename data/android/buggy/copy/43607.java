@java.lang.Override
public java.lang.String toString() {
    return isBuiltin() ? name : (((name) + " (") + (location)) + ")";
}