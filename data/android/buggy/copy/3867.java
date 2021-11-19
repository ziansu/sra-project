@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    android.util.Log.v(Constants.TAG, ("SAVED POSITION AT " + (videoPosition)));
    outState.putLong(JsonKeys.VIDEO_POSITION_KEY, videoPosition);
    outState.putParcelable(JsonKeys.VIDEO_DATA_KEY, stepItem);
    super.onSaveInstanceState(outState);
}