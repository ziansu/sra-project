public void beginSale() {
    if (!(activeSale)) {
        currentSale = new sss.domain.Sale(nextSaleId);
        activeSale = true;
    }
}