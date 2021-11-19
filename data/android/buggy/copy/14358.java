@java.lang.Override
public void setOffsetLength(int offset, int length) {
    if ((offset + length) > (buffer.length)) {
        throw new java.lang.IllegalArgumentException("length");
    }
    this.offset = offset;
}