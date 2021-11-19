public static org.javarosa.core.services.IPropertyManager instance() {
    if ((org.javarosa.core.services.PropertyManager.instance) == null) {
        org.javarosa.core.services.PropertyManager.initDefaultPropertyManager();
    }
    return org.javarosa.core.services.PropertyManager.instance;
}