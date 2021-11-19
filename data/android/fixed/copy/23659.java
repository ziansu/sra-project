public int hashCode(org.eclipse.emf.ecore.EStructuralFeature feature) {
    java.lang.Object value = getValue(feature);
    if (value == null) {
        return 1;
    }
    return value.hashCode();
}