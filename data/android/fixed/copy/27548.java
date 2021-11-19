public java.lang.Class<?> getExportedClass(java.lang.String className) {
    if ((this.exportedClasses) != null)
        return this.exportedClasses.get(className);
    
    return null;
}