public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
    java.lang.String filterText = search.getText();
    outline.setFilterText(filterText);
}