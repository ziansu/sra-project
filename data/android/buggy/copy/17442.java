protected void setAttributeValue(final java.lang.String attributeValue) {
    if (!(java.util.Objects.equals(this.attributeValue, attributeValue))) {
        setModified(true);
        invokeValueChangeListeners();
    }
    this.attributeValue = attributeValue;
}