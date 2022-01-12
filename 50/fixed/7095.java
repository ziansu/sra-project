public void c57run() {
    if ((noteEditor) != null) {
        if (noteEditor.getScene().getWindow().isShowing()) {
            noteEditor.c57run();
        }else {
            noteEditor = null;
        }
    }
}