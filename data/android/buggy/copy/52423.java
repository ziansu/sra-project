@java.lang.Override
public void processResponse(java.lang.String output) {
    android.util.Log.d(com.udacity.gradle.builditbigger.MainActivity.YOLOPAD, ((com.udacity.gradle.builditbigger.MainActivity.RESPONSE_FROM_SERVER_IS) + output));
    findViewById(R.id.progress_bar).setVisibility(View.VISIBLE);
    result = output;
}