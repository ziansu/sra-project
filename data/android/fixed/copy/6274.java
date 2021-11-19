public static boolean shouldLoadMoreBars() {
    return (org.wordpress.android.ui.stats.StatsUtils.getSmallestWidthDP()) >= (org.wordpress.android.ui.stats.StatsUIHelper.TABLET_720DP);
}