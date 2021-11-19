public void setTRXQTY(int TRXQTY) {
    int oldTRXQTY = this.TRXQTY;
    this.TRXQTY = TRXQTY;
    propertyChangeSupport.firePropertyChange("TRXQTY", oldTRXQTY, TRXQTY);
}