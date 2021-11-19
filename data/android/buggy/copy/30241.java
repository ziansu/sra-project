@java.lang.Override
public boolean isPrimitive() {
    return ((this.method) != null) && ((this.method.isIntrinsic()) || (this.getType().isPrimitive()));
}