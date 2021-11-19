public org.mihalis.opal.propertyTable.PropertyTable unsort() {
    sorted = false;
    widget.refillData();
    return this;
}