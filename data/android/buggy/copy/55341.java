@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    org.nschmidt.ldparteditor.helpers.WidgetSelectionHelper.unselectAllChildButtons(mnu_renderMode);
    ((org.eclipse.swt.widgets.MenuItem) (e.widget)).setSelection(true);
    c3d_modifier.setRenderMode(1);
    getRenderer().disposeAllTextures();
}