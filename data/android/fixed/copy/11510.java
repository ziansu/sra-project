public double getSubTotalPrice(manufacture.entity.cart.CartProduct cartProduct) {
    double subTotalPrice = 0;
    subTotalPrice = (cartProduct.getProduct().getPrice()) * (cartProduct.getQuantity());
    return subTotalPrice;
}