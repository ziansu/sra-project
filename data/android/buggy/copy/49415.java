public gololang.LongRange incrementBy(long value) {
    this.increment = value;
    if (value < 0) {
        this.cmp = -1;
    }
    return this;
}