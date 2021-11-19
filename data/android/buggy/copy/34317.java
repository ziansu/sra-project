@java.lang.Override
public void widgetSelected(llyska.interfaces.SelectionEvent e) {
    if (_checkButton.getSelection()) {
        _calculateButton.setEnabled(false);
    }else {
        _calculateButton.setEnabled(true);
    }
}