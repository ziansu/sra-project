@java.lang.Override
public void onGroupExpand(int groupPosition) {
    if (((lastExpandPosition) != (-1)) && (groupPosition != (lastExpandPosition))) {
        expListView.collapseGroup(lastExpandPosition);
    }
    lastExpandPosition = groupPosition;
}