@android.support.annotation.Nullable
public com.yarolegovich.discretescrollview.ViewHolder getViewHolder(int position) {
    android.view.View view = layoutManager.findViewByPosition(position);
    return view != null ? getChildViewHolder(view) : null;
}