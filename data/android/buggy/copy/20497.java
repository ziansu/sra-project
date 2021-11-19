public void setHighlighted(boolean highlighted) {
    if ((this.isHighlighted) != (isHighlighted)) {
        isHighlighted = highlighted;
        refreshDrawableState();
    }
}