public boolean removeProducts(java.lang.String productId, int count) {
    try {
        getInventory().removeStock(productId, count);
        return true;
    } catch (java.lang.Exception e) {
        return false;
    }
}