@java.lang.Override
public void hideProgressBar() {
    android.util.Log.d(com.example.moyiliu.imagegallerymvp.screen.base.recycler.BaseRecyclerActivity.TAG, "hideProgressBar: ");
    if ((mProgressBar) != null)
        mProgressBar.setVisibility(View.GONE);
    
}