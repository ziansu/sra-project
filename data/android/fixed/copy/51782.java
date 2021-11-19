private static void LOG(java.lang.String message, java.lang.Object... args) {
    if ((args != null) && ((args.length) > 0)) {
        message = java.lang.String.format(message, args);
    }
    android.util.Log.d("BetterVideoPlayer", message);
}