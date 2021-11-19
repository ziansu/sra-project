@java.lang.Override
public boolean accept(java.io.File pathname) {
    if (pathname.getName().startsWith(".")) {
        return false;
    }
    return true;
}