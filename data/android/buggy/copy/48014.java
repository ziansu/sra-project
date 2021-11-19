public void addMarker(com.android.yardsale.models.YardSale ys) {
    btFlip.setVisibility(View.GONE);
    com.android.yardsale.fragments.SaleMapFragment.yardSaleList = null;
    com.android.yardsale.fragments.SaleMapFragment.yardSale = ys;
    addYardSale(ys, false);
}