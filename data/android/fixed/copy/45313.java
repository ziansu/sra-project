public void reset(int startOffset, int length) {
    assert length >= 0;
    assert startOffset >= 0;
    this.startOffset = startOffset;
    this.length = length;
}