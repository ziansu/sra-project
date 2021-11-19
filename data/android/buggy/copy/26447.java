@java.lang.Override
public void append(java.util.List<?> list) {
    int startPos = (data.size()) - 1;
    data.addAll(list);
    notifyItemRangeInserted(startPos, list.size());
}