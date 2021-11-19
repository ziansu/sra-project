public static model.Product lookupProduct(int productID) {
    model.Product result = null;
    for (model.Product product : model.Inventory.products) {
        if ((product.getProductID()) == productID) {
            result = product;
            break;
        }
    }
    return result;
}