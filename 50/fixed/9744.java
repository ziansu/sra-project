@java.lang.Override
public void onItemDismiss(int position) {
    if ((mTaskList.size()) > 0) {
        mTaskList.remove(position);
        notifyItemRemoved(position);
    }
}