public synchronized boolean contains(final java.lang.String sku) {
    com.google.common.base.Preconditions.checkArgument(isLoaded());
    return inventory.hasPurchase(sku);
}