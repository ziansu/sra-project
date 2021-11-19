public boolean isExported(java.lang.String className) {
    if ((this.exportedClasses) != null)
        return this.exportedClasses.containsKey(className);
    
    return false;
}