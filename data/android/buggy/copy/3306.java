public java.lang.String addCurrentProduct() {
    basketService.addProductToBasket(currentProduct.getProduct(), quantity);
    quantity = 1;
    return "Added to Basket";
}