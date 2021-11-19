@java.lang.Override
public java.lang.Object[] toArray() {
    if ((count) == 0) {
        return new java.lang.Object[0];
    }
    return java.util.Arrays.copyOfRange(value, offset, ((offset) + (count)));
}