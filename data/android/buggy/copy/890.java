public java.lang.Object fNoAccessDynamicGet(int featureID) {
    java.lang.Object[] eBasicSettings = fNoAccessBasicSettings();
    if (eBasicSettings == null) {
        eBasicSettings = fNoAccessBasicSettings();
    }
    return eBasicSettings[(featureID - (eStaticFeatureCount()))];
}