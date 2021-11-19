public static final <V> de.mxro.async.map.AsyncMap<java.lang.String, V> encodeKeysForCaseInsensitiveStorage(final de.mxro.async.map.AsyncMap<java.lang.String, V> map) {
    return de.mxro.async.map.AsyncMaps.filterKeys(new de.mxro.async.map.sql.internal.EncodeCaseInsensitiveKey(), map);
}