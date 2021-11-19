public co.paralleluniverse.capsule.CapsuleLauncher setProperty(java.lang.String property, java.lang.String value) {
    if (value != null)
        properties.setProperty(property, value);
    else
        properties.remove(property);
    
    return this;
}