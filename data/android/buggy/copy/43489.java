public boolean accept(java.io.File dir, java.lang.String name) {
    if (name.endsWith(".yml"))
        return true;
    
    return false;
}