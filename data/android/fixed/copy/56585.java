@java.lang.Override
public int getItemCount() {
    if ((mLoadMoreEnable) && (!(data.isEmpty()))) {
        return (data.size()) + 1;
    }
    return data.size();
}