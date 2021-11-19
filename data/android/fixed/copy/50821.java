@java.lang.Override
public int getItemViewType(int position) {
    if ((data) == null)
        return com.teinvdlugt.android.greekgods.AllPeopleRecyclerViewAdapter.NO_PEOPLE_ITEM_VIEW_TYPE;
    else
        return com.teinvdlugt.android.greekgods.AllPeopleRecyclerViewAdapter.PERSON_ITEM_VIEW_TYPE;
    
}