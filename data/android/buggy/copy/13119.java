@java.lang.Override
public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
    setDirty(true);
    org.gwtbootstrap3.client.ui.ListBox box = ((org.gwtbootstrap3.client.ui.ListBox) (event.getSource()));
    param.setValue(box.getSelectedItemText());
}