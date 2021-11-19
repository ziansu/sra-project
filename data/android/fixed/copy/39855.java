public void removeItem(int index) {
    values.remove(index);
    listBox.removeItem(index);
    if (initialized) {
        initializeMaterial(listBox.getElement());
    }
}