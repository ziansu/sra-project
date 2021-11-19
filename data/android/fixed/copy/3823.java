public void OpenFileForWrite() {
    try {
        Pen = new java.util.Formatter(new java.io.BufferedWriter(new java.io.FileWriter(this.fileName, false)));
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Warning! File doesn't exist.");
    }
}