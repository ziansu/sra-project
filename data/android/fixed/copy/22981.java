public java.nio.file.Path compile(java.nio.file.Path filePath) {
    try {
        view.CompileLog log = new view.CompileLog(filePath);
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
    return filePath;
}