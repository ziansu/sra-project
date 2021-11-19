boolean moreProductsAvailable() {
    return ((state.totalProducts) <= 0) || ((state.products.size()) < (state.totalProducts));
}