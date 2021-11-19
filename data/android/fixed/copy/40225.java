public void addWellSample(org.openmicroscopy.shoola.agents.dataBrowser.browser.WellSampleNode node) {
    if (node != null) {
        samples.add(node);
    }
    setSelectedWellSample(0);
}