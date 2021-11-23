@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(com.almasosorio.sharethatbill.RecyclerViewAdapter.TAG, ("adapter received click on item " + (getPosition())));
    if ((onListItemClickListener) != null)
        onListItemClickListener.onItemClick(getPosition());
    
}