public void remove(data.ProductType productType) {
    this.products.put(productType, ((this.products.get(productType).intValue()) - 1));
}