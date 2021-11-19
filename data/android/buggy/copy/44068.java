public android.content.Context getContext() {
    if (containsObject(com.jstakun.gms.android.config.ConfigurationManager.CONTEXT, android.content.Context.class)) {
        return ((android.content.Context) (com.jstakun.gms.android.config.ConfigurationManager.objectCache.get(com.jstakun.gms.android.config.ConfigurationManager.CONTEXT)));
    }
    return null;
}