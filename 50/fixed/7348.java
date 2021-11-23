private int getRealItemCount() {
    return (mInnerAdapter) == null ? 0 : mInnerAdapter.getItemCount();
}