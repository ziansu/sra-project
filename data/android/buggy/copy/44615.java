public void fNoAccessDynamicSet(int featureID, java.lang.Object value) {
    java.lang.Object[] eBasicSettings = fNoAccessBasicSettings();
    if (eBasicSettings == null) {
        eBasicSettings = fNoAccessBasicSettings();
    }
    eBasicSettings[(featureID - (eStaticFeatureCount()))] = value;
}