@java.lang.Override
public long getItemId(int position) {
    if ((mUsers.get(position)) == null)
        return 0;
    
    return mUsers.get(position).getId();
}