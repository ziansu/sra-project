public static boolean isInitialized() {
    try {
        return com.amazon.ags.api.AmazonGamesClient.isInitialized();
    } catch (java.lang.Exception e) {
    }
    return false;
}