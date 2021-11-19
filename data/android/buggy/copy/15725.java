@com.google.gwt.uibinder.client.UiHandler(value = "cbTypeTXT")
void onCheckBoxClickedTXT(com.google.gwt.event.dom.client.ClickEvent event) {
    if (cbTypeTXT.getValue()) {
        fileTypes.add(FileType.TXT);
    }else {
        fileTypes.remove(FileType.TXT);
    }
    monitorTotalCheckbox();
}