@java.lang.Override
public void setValue(final java.lang.Boolean value) {
    if (isAttached()) {
        setValue(value, false);
    }else {
        checkBox.setValue(value);
    }
}