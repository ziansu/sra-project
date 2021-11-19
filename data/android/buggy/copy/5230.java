@java.lang.Override
public void onResume() {
    super.onResume();
    if (co.smartreceipts.android.BuildConfig.DEBUG) {
        android.util.Log.d(co.smartreceipts.android.fragments.ReceiptsFragment.TAG, "onResume");
    }
}