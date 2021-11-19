@java.lang.Override
public boolean accept(java.io.File file) {
    return (file.isDirectory()) && (!("target".equals(file.getName())));
}