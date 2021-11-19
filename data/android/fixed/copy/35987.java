public java.util.LinkedList<SharedClasses.Quartet<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer>> getDefectItems(java.lang.String StoreAddress) {
    productInStore.InitTable();
    return productInStore.getDefectItems(StoreAddress);
}