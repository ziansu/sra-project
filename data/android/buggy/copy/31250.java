@java.lang.Override
public long getChildId(int groupPosition, int childPosition) {
    if (childPosition == 0)
        return 0;
    
    return getChild(groupPosition, childPosition).hashCode();
}