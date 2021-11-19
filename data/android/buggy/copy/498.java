@java.lang.Override
public int compare(org.ei.opensrp.path.adapter.ExpandedListAdapter.ItemData<Pair<java.lang.String, java.lang.String>, java.util.Date> lhs, org.ei.opensrp.path.adapter.ExpandedListAdapter.ItemData<Pair<java.lang.String, java.lang.String>, java.util.Date> rhs) {
    return lhs.getTagData().compareTo(rhs.getTagData());
}