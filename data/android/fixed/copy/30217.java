protected void internalSetReadonlyFieldValue(java.lang.String value) {
    boolean isRo = field.isReadOnly();
    field.setReadOnly(false);
    field.setValue(value);
    field.setReadOnly(isRo);
}