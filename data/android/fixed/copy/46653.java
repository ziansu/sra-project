public void addListOfProducts(java.util.List<com.springapp.model.Product> productList) {
    for (int i = 0; i < (productList.size()); i++) {
        products.add(productList.get(i));
    }
}