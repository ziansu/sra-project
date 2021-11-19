public static long getSelectedStoryPageSecondary(android.content.Context context) {
    long id = android.preference.PreferenceManager.getDefaultSharedPreferences(context).getLong(utils.UWPreferenceManager.STORY_PAGE_SECONDARY, (-1));
    return id;
}