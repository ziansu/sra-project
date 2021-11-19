public void datasetChanged(java.util.List<com.random.recyclerviewbug.MainModel> dataset) {
    android.support.v7.util.DiffUtil.DiffResult diffResult = calculateDiffResult(dataset);
    this.dataset = dataset;
    diffResult.dispatchUpdatesTo(this);
}