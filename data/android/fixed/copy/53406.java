@java.lang.Override
public boolean isResolved() {
    return ((this.method) != null) && (this.method.getType().isResolved());
}