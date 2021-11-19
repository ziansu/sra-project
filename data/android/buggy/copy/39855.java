public void removeItem(int index) {
    listBox.removeItem(index);
    if (initialized) {
        initializeMaterial(listBox.getElement());
    }
}