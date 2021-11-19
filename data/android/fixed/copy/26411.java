public org.gazelle.models.TransactionEntry setPrice(double price) {
    if ((this.price) != price) {
        this.price = price;
        this.propertyChanged(TransactionEntryFieldNames.PRICE);
    }
    return this;
}