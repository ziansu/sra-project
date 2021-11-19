public void onScrolledToBottomOfList() {
    if ((state.pageNumber) < (state.nextPageNumber)) {
        productService.getProducts(new com.atoennis.walmartcodechallenge.data.ProductService.GetProductsRequest(state.nextPageNumber, state.pageSize));
    }
}