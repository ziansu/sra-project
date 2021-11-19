@java.lang.Override
protected java.util.List<com.wheretoshop.model.WhereToShopProduct> doInBackground(java.lang.String... args) {
    com.wheretoshop.model.utilities.PriceTableDataSource ds = new com.wheretoshop.model.utilities.PriceTableDataSource();
    return ds.getBestPrice(getApplicationContext());
}