public void addFile(java.lang.String file) {
    java.io.File f = new java.io.File(file);
    listModel.addElement(f.getName());
}