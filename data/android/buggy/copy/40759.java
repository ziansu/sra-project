@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    android.util.Log.d(getClass().toString(), "Failed to fetch trailers");
    reviewTextView.setText(getResources().getString(R.string.no_trailers));
    trailerExpandButton.setVisibility(View.INVISIBLE);
}