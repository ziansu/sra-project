public void addRequiredClass(java.lang.String className, java.lang.Class<?> clazz) {
    if ((this.requiredClasses) == null)
        this.requiredClasses = new java.util.HashMap<>();
    
    this.requiredClasses.put(className, clazz);
}