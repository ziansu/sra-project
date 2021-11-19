@java.lang.Override
public void focusLost(final org.mihalis.opal.horizontalSpinner.FocusEvent e) {
    if (this.text.getText().trim().equals("")) {
        this.setSelection(this.storedValue);
    }
}