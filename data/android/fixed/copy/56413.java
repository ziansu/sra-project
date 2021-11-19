@java.lang.Override
public boolean accept(java.io.File pathname) {
    return (fileFilter.accept(pathname)) && (!(lookup.lookupDatabase(pathname)));
}