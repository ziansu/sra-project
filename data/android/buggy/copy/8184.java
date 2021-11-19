@java.lang.Override
public boolean accept(java.io.File file) {
    return (isRCDR(file.getName())) || (file.isDirectory());
}