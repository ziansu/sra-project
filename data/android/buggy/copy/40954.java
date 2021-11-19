private boolean isLeaf(int pos) {
    if ((pos >= ((this.size) / 2)) && (pos <= (this.size))) {
        return true;
    }
    return false;
}