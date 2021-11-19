public java.lang.String getTitle() {
    return isCompactTitleMode ? com.khrolenok.rates.util.StockNames.getInstance().getSymbol(this.goodCode) : this.goodCode;
}