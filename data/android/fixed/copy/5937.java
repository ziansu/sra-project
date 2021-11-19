@java.lang.Override
protected void updateProperties() {
    setEnabled(isThereAtLeastOneFeatureThatHasChildren());
    if (!(isThereAtLeastOneFeatureThatHasChildren())) {
        setChecked(false);
    }else {
        setChecked(isEveryFeatureCollapsed());
    }
}