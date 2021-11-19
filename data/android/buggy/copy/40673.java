@java.lang.Override
public boolean onLongClick(android.view.View v) {
    mListener.onListFragmentLongInteraction(holder.mItem);
    return true;
}