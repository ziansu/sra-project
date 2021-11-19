public synchronized void updateAll(@android.support.annotation.NonNull
java.util.Collection<TModel> tableCollection) {
    updateAll(tableCollection, modelSaver.getWritableDatabase());
}