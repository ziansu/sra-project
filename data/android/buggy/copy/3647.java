public void printRecSubtotal(long amount) throws java.lang.Exception {
    checkTotal(getSubtotal(), amount);
    addTextItem(formatStrings(getParams().subtotalText, ("=" + (com.shtrih.util.StringUtils.amountToString(getSubtotal())))));
}