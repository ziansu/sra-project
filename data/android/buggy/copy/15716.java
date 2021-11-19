public java.lang.Boolean isFile() {
    elfdreaming.app.util.FileWalker.logger.info("isFile called");
    java.io.File f = new java.io.File(url);
    if (f.isDirectory()) {
        selectDir();
        return false;
    }
    return true;
}