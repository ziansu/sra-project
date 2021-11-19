@java.lang.Override
public boolean validateValue(java.lang.String value) {
    if (!(validateFlag)) {
        return true;
    }
    return super.validateValue(value);
}