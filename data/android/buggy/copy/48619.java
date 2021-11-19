@java.lang.Override
public void onAttachedToRecyclerView(android.support.v7.widget.RecyclerView recyclerView) {
    super.onAttachedToRecyclerView(recyclerView);
    android.util.Log.d(getClass().getSimpleName(), "Attaching to recycler view");
    mLastSelectedViewHolder.mLastSelectedItem = mSharedPreferences.getLong(DEADLINES_LAST_SELECTED_ITEM_KEY, (-1));
}