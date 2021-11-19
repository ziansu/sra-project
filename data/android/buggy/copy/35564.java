void startReordering(int position) {
    mReorderPosition = position;
    mDropPosition = position;
    decoratedAdapter.notifyItemChanged(position);
}