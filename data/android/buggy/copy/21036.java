@java.lang.Override
protected boolean persistString(java.lang.String value) {
    return persistInt(java.lang.Integer.valueOf(value));
}