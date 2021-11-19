@java.lang.Override
public void onDataInserted(int positionStart, int itemCount) {
    mAdapter.notifyItemRangeInserted(positionStart, itemCount);
    mEventBus.post(new de.fau.cs.mad.fablab.android.view.fragments.icalandnews.NewsListChangeEvent(mAdapter.getItemCount()));
}