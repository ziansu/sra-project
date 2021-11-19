@java.lang.Override
public boolean accept(java.io.File file) {
    return (file.getName().startsWith(fileid)) && (file.getName().endsWith(".so"));
}