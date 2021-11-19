protected <T> void showActivity(java.lang.Class<T> cl) {
    android.app.Activity activity = getContext();
    if (activity != null) {
        activity.startActivity(new android.content.Intent(activity, cl));
    }
}