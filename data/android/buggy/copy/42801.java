private void trainMap() {
    if (exhaustiveRadioButton.isSelected()) {
        createExhaustiveSOM();
    }else {
        createSampleSOM();
    }
    runButton.setEnabled(true);
}