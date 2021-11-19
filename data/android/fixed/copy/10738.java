@java.lang.Override
public boolean setBitIfUnset(int index) {
    if (!(this.getBit(index))) {
        return this.setBit(index);
    }
    return false;
}