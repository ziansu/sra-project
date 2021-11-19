@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putString(Constants.VIDEO_URL, videoUrl);
    outState.putString(Constants.STEP_DESCRIPTION, stepDescription);
    super.onSaveInstanceState(outState);
}