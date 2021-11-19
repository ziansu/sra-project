public static boolean getSeen(android.content.Context c, java.lang.String key) {
    return c.getSharedPreferences("Kantidroid", Context.MODE_PRIVATE).contains(key);
}