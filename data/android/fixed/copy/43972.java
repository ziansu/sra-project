public boolean remove(T value) {
    this.setRemoveHasChanged(false);
    root = remove(root, value);
    --(count);
    return this.removeHasChanged;
}