@java.lang.Override
public void onAllDataRemoved(int itemCount) {
    mAdapter.notifyItemRangeRemoved(0, itemCount);
    mEventBus.post(new de.fau.cs.mad.fablab.android.view.fragments.icalandnews.NewsListChangeEvent(mAdapter.getItemCount()));
}