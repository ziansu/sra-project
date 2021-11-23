@java.lang.Override
public void onItemRangeInserted(int positionStart, int itemCount) {
    super.onItemRangeInserted(positionStart, itemCount);
    if (progressBar != null)
        progressBar.setVisibility(View.GONE);
    
}