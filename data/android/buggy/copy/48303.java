public java.math.BigDecimal getAmount() {
    if (((salesInvoiceItem) == null) || ((quantity) == null)) {
        return null;
    }else {
        return salesInvoiceItem.getUnitPrice().multiply(new java.math.BigDecimal(quantity));
    }
}