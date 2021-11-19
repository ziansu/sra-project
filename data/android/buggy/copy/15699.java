@java.lang.Override
public java.lang.String get(final boolean formatParams, final java.lang.String key, final java.lang.Object... params) {
    return bundles.get(getCurrentLocale(), key, params);
}