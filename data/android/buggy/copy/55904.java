public static com.defch.blogwbly.MyApplication getInstance(android.content.Context context) {
    return context != null ? ((com.defch.blogwbly.MyApplication) (context.getApplicationContext())) : com.defch.blogwbly.MyApplication.instance;
}