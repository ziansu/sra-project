public synchronized void select(java.lang.String messageId) {
    unselectCurrent();
    selectNew(messageId);
    notifyItemChanged(getItemPosition(messageId));
}