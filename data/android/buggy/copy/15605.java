public boolean shift(char c, boolean mark) {
    return this.re.shift(c, (mark || (this.marked)));
}