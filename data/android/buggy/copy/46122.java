protected android.content.Context getContext() {
    android.content.Context context = null;
    if ((weakContext) != null) {
        context = weakContext.get();
    }
    return context;
}