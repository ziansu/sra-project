@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    connectAgent.setSelection((!(uploadAgent.getSelection())));
    setDirty();
}