public void reloadBMSFile() {
    if ((model) != null) {
        java.io.File f = new java.io.File(model.getPath());
        model = loadBMSModel(f);
    }
    clear();
}