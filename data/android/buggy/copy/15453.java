@java.lang.Override
public void onError() {
    progressBar.setVisibility(View.GONE);
    android.widget.Toast.makeText(mContext, "picasso error", Toast.LENGTH_SHORT).show();
}