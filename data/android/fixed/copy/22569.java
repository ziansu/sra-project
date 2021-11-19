@java.lang.Override
public void onStop() {
    com.squareup.picasso.Picasso.with(this).cancelRequest(mTarget);
    super.onStop();
}