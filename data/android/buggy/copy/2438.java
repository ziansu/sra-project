private boolean isNicToConfigureContainTheLabel(java.lang.String nicName, java.lang.String label) {
    java.util.Set<java.lang.String> labelsToConfigure = getLabelsToConfigureOnNic(nicName);
    return labelsToConfigure == null ? false : labelsToConfigure.contains(label);
}