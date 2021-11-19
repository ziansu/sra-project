@java.lang.Override
protected void cleanup(org.apache.mahout.clustering.lda.cvb.Context context) {
    getModelTrainer().stop();
}