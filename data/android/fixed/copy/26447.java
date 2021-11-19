@java.lang.Override
public void append(java.util.List<?> list) {
    int startPos = data.size();
    data.addAll(list);
    notifyItemRangeInserted(startPos, list.size());
}