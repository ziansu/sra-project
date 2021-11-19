public void addCurrentProduct() {
    basketService.addProductToBasket(currentProduct.getProduct(), quantity);
    quantity = 1;
}