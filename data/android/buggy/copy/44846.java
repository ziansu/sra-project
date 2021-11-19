public void closeTag() {
    if ((modified) && (Configuration.autoSaveTagModifications.get())) {
        saveText();
    }
    textTag = null;
}