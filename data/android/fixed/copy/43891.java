@java.lang.Override
public boolean accept(java.io.File pathname) {
    return !(pathname.getName().startsWith("."));
}