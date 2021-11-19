public boolean excludesClass(java.lang.String classname) {
    for (java.lang.String excludePattern : getExcludedClasses()) {
        if (classname.matches(excludePattern))
            return true;
        
    }
    return false;
}