public static void reload(android.content.Context context) {
    fforganizer.ResourceLoader.loaded = false;
    fforganizer.ResourceLoader.load(context);
}