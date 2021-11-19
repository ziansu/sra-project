public void load() {
    try {
        loadMatchConfig();
        loadPitConfig();
        loadScanConfig();
        loadBaselineConfig();
        loadFileConfig();
    } catch (org.jdom2.DataConversionException e) {
        e.printStackTrace();
    }
}