@java.lang.Override
public long getItemId(int position) {
    if (position < (mResults.size())) {
        mResults.get(position).getDateAdded();
    }
    return android.support.v7.widget.RecyclerView.NO_ID;
}