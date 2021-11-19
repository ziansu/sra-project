@java.lang.Override
public int getChildrenCount(int groupPosition) {
    if ((_listDataChild) == null)
        return 0;
    else
        return this._listDataChild.get(this._listDataHeader.get(groupPosition)).size();
    
}