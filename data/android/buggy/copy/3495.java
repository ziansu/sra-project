public java.math.BigDecimal getTotalCost() {
    java.math.BigDecimal total = com.pj.magic.Constants.ZERO;
    for (com.pj.magic.model.BadStockReturnItem item : items) {
        total = total.add(item.getCost());
    }
    return total;
}