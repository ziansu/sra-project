@java.lang.Override
public void run() {
    if (startIndex != (-1)) {
        adapter.notifyItemRangeInserted(startIndex, posts.posts.size());
    }else {
        adapter.notifyDataSetChanged();
    }
}