@java.lang.Override
public boolean onGroupClick(android.widget.ExpandableListView parent, android.view.View v, int groupPosition, long id) {
    startActivity(v.getContext(), groupPosition);
    return true;
}