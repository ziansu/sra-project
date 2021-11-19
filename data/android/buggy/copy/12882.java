public void showClass(com.metsci.laproc.data.ClassifierDataSet data) {
    this.classPanel.clearTable();
    com.metsci.laproc.display.GraphableFunction func = new com.metsci.laproc.display.ROCCurve(data);
    com.metsci.laproc.display.GraphableData output = func.compute();
    this.classPanel.addDataSetToTable("Initial Classifier Data Set", output);
}