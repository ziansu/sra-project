void newFile() {
    if (changed) {
        confirmClose();
        saveFile();
        changed = false;
    }else {
        textArea.setText("");
        changed = false;
    }
}