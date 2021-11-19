public org.gazelle.models.TransactionEntry setQuantity(int quantity) {
    if ((this.quantity) != quantity) {
        this.quantity = quantity;
        this.propertyChanged(TransactionEntryFieldNames.QUANTITY);
    }
}