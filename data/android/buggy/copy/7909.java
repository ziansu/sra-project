@java.lang.Override
public boolean accept(java.io.File file) {
    return (file.isDirectory()) || (file.getName().endsWith(".xlsx"));
}