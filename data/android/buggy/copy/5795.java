public void deleteProduct(long itemID, int productLinker) {
    orderDao.deleteOrdersByProductID(itemID);
    int numDeleted = productDao.deleteDecoratedProduct(productLinker);
    if (numDeleted == 0)
        java.lang.System.out.println("error in deleting single product");
    
}