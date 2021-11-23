@java.lang.Override
public void run() {
    listAdapter.notifyDataSetChanged();
    if ((checkpoints.size()) > 0) {
        recyclerView.smoothScrollToPosition(((checkpoints.size()) - 1));
    }
}