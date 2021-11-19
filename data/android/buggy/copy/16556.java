@java.lang.Override
protected int computeHashCode() {
    return (super.hashCode()) ^ (java.util.Arrays.hashCode(values));
}