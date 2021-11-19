public java.util.List<com.mobilevanity.backend.data.Sale> findSaleByProduct(com.mobilevanity.backend.data.Product product) {
    return com.googlecode.objectify.ObjectifyService.ofy().load().type(com.mobilevanity.backend.data.Sale.class).filter("product", product).order("startDay").list();
}