public static int getCacheKey() {
    int weekOfYear = de.atomfrede.android.mensa.ubi.util.Util.getWeekOfYear();
    int year = de.atomfrede.android.mensa.ubi.util.Util.getYear();
    int cacheKey = year + weekOfYear;
    return cacheKey;
}