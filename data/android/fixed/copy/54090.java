public void doImport() {
    try {
        loadSections(null, mBookDirectory);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}