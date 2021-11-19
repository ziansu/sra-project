public void reloadBMSFile() {
    java.io.File f = new java.io.File(model.getPath());
    model = loadBMSModel(f);
    clear();
}