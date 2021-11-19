@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putLong(JsonKeys.VIDEO_POSITION_KEY, videoPosition);
    outState.putParcelable(JsonKeys.VIDEO_DATA_KEY, stepItem);
    super.onSaveInstanceState(outState);
}