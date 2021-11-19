@java.lang.Override
public void onDetachedFromWindow(android.support.v7.widget.RecyclerView view, android.support.v7.widget.RecyclerView.Recycler recycler) {
    super.onDetachedFromWindow(view, recycler);
    updateFirstAdapterPosition();
}