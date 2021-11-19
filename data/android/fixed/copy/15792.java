public java.lang.String call() throws java.io.IOException {
    java.io.File exe = super.getExeFile();
    if (exe.exists())
        return exe.getPath();
    
    return null;
}