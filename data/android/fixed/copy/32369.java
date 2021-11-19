@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (((predicate) == null) || (predicate.test(context, intent))) {
        loader.onContentChanged();
    }
}