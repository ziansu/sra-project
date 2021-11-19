private boolean fetchViews() {
    listView = ((android.widget.ListView) (rootView.findViewById(R.id.collection_item_list)));
    if ((listView) == null)
        return false;
    
    return true;
}