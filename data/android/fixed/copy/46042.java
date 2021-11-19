private static void insertNut(android.content.ContentResolver contentResolver, com.izettle.wrench.core.Nut nut) {
    contentResolver.insert(com.izettle.wrench.core.ConfigProviderContract.nutUri(), nut.toContentValues());
}