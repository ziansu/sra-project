public static void removeCompany(stock.theme.StockTheme st) {
    synchronized(stock.market.StockMarketManager.stockCompanyList) {
        stock.market.StockMarketManager.stockCompanyList.remove(st);
    }
}