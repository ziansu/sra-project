@java.lang.Override
public void onItemDismiss(int position) {
    mCards.remove(position);
    projectItemList.remove(position);
    io.paperdb.Paper.put("projects", projectItemList);
    notifyItemRemoved(position);
}