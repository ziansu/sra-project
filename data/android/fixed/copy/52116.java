private co.cask.cdap.data2.dataset2.DynamicDatasetCache entryForCurrentThread() {
    try {
        return perThreadMap.get(java.lang.Thread.currentThread());
    } catch (java.util.concurrent.ExecutionException e) {
        throw com.google.common.base.Throwables.propagate(e);
    }
}