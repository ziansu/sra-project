private java.lang.Boolean shouldInsert(pl.com.bottega.photostock.sales.model.Product product) {
    pl.com.bottega.photostock.sales.model.Product dbProduct = load(product.getNumber());
    return (!(product.equals(dbProduct))) || (dbProduct == null);
}