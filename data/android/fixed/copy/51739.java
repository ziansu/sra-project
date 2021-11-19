public void setManual(de.ovgu.featureide.fm.core.configuration.SelectableFeature feature, de.ovgu.featureide.fm.core.configuration.Selection selection) {
    feature.setManual(selection);
    update(true, null);
}