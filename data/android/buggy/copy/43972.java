public boolean remove(T value) {
    this.setRemoveHasChanged(false);
    root = remove(root, value);
    return this.removeHasChanged;
}