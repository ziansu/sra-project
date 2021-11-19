@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    org.nschmidt.ldparteditor.helpers.WidgetSelectionHelper.unselectAllChildButtons(mnu_lineMode);
    ((org.eclipse.swt.widgets.MenuItem) (e.widget)).setSelection(true);
    mntmAlwaysBlack[0].setSelection(isBlackEdges());
    c3d_modifier.setLineMode(2);
}