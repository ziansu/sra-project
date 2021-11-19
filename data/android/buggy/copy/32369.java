@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (((predicate) == null) || (predicate.test(context, intent))) {
        android.util.Log.d(be.ugent.zeus.hydra.loaders.changes.BroadcastListener.TAG, "onReceive: Content was changed due to LocalBroadcast.");
        loader.onContentChanged();
    }
}