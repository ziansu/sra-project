void generateMulti(int seqThreshold) {
    gov.nih.nlm.lhc.openi.panelseg.ExpTask task = new gov.nih.nlm.lhc.openi.panelseg.ExpTask(this, 0, imagePaths.size(), seqThreshold);
    task.invoke();
}