@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int swipeDir) {
    int position = viewHolder.getAdapterPosition();
    mProductAdapter.removeAt(position);
    mProducts.remove(position);
    mRetainedFragment.setProducts(mProducts);
}