@java.lang.Override
public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    position = savedInstanceState.getInt("Position");
    myVideoView.seekTo(position);
}