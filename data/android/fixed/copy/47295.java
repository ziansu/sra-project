public int getValueAtColumn(int column) {
    return this.unsafe.getInt(((this.writeBaseAddress) + (column << 2)));
}