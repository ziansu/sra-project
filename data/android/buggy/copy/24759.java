@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent arg0) {
    generateButton.setEnabled(false);
    GenerateWindow(shell);
    (counter)++;
}