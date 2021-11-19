protected <T> void showActivity(java.lang.Class<T> cl) {
    android.app.Activity activity = getContext();
    activity.startActivity(new android.content.Intent(activity, cl));
}