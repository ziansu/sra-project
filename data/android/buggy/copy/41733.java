public void removeItem(int index) {
    inventory.remove(index);
    bounds.remove(index);
    genImage(getImage());
}