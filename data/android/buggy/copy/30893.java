public boolean addItem(post.Store store, java.lang.String code, int number) {
    if (store.isInInventory(code)) {
        cart.put(code, number);
        return true;
    }
    return false;
}