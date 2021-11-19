public void removeProduct(java.lang.Integer ref) {
    if (productsInCart.containsKey(ref)) {
        productsInCart.remove(ref);
    }
}