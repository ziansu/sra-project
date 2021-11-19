public org.gazelle.models.TransactionEntry setPrice(float price) {
    if ((this.price) != price) {
        this.price = price;
        this.propertyChanged(TransactionEntryFieldNames.PRICE);
    }
}