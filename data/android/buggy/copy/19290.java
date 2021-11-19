public org.mihalis.opal.propertyTable.PropertyTable unsort() {
    this.sorted = false;
    this.widget.refillData();
    return this;
}