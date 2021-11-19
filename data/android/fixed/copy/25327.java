@java.lang.Override
public int getChildrenCount(int groupPosition) {
    return this._listDataChild.get(this._listDataHeader.get(groupPosition)).size();
}