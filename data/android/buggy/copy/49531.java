private void checkFile(java.io.File file) {
    if (file.exists()) {
        return ;
    }
    if (!(file.mkdirs())) {
        java.lang.System.err.println("The creation of the directories failed.");
    }else {
        setFile(file);
    }
}