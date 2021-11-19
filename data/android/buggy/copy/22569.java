@java.lang.Override
public void onStop() {
    com.crashlytics.android.Crashlytics.log(Log.DEBUG, TAG, "canceling Picasso request");
    com.squareup.picasso.Picasso.with(this).cancelRequest(mTarget);
    super.onStop();
}