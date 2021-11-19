@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    org.nschmidt.ldparteditor.workbench.WorkbenchManager.getUserSettingState().setIconSize(2);
    regainFocus();
}