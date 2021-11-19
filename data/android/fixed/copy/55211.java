public boolean hasPermissionToAccess(int productId) {
    return (productService.getUserIdByProductId(productId)) == (getCurrentUser().getId());
}