public static <T extends java.lang.Object> T getCastData(java.lang.String key, android.os.Bundle dataStore) {
    if (!(dataStore.containsKey(key))) {
        return null;
    }
    return ((T) (dataStore.get(key)));
}