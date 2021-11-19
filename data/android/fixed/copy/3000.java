@java.lang.Override
public void run() {
    if (startIndex != (-1)) {
        adapter.notifyItemRangeInserted((startIndex + 1), posts.posts.size());
    }else {
        adapter.notifyDataSetChanged();
    }
}