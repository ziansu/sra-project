final boolean hasValidValueCount() {
    if ((this.expectedValueCount) < 0) {
        return true;
    }else {
        return (this.expectedValueCount) == (this.valueCount.get());
    }
}