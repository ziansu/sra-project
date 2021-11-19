@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    setIgnoreSupplied(ignoreSuppliedBtn.getSelection());
    if (ignoreSuppliedBtn.getSelection()) {
        setShowSuppliedWithBrackets(false);
        showSuppliedWithBracketsBtn.setSelection(false);
    }
}