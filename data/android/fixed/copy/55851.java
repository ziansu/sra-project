public static void openIt(final android.content.Context context, final com.paulvarry.intra42.api.UserLTE user, com.paulvarry.intra42.AppClass app) {
    if (user != null)
        com.paulvarry.intra42.tab.user.UserActivity.openIt(context, user.login, app);
    
}