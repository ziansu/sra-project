@java.lang.Override
public void clear() {
    listBox.clear();
    if (initialized) {
        initializeMaterial(listBox.getElement());
    }
}