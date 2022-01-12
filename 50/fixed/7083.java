public burlap.mdp.core.oo.state.ObjectInstance copyWithName(java.lang.String objectName) {
    if (!(objectName.equals(className)))
        throw new java.lang.RuntimeException("Object must be class block");
    
    return copy();
}