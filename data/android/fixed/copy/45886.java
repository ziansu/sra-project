public static boolean isStockExists(java.lang.String searchedStock) {
    try {
        models.trade.Stock.valueOf(searchedStock.toUpperCase());
    } catch (java.lang.IllegalArgumentException e) {
        return false;
    }
    return true;
}