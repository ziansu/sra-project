@java.lang.Override
public void goToCourseUrl(java.lang.String url) {
    android.content.Intent mainIntent = com.epsilon.screens.main.MainActivity.makeIntent(getActivity(), MainActivity.COURSES_TAB_POSITION);
    startActivity(mainIntent);
    android.content.Intent browserIntent = new android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse(url));
    startActivity(browserIntent);
}