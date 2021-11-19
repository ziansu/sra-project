@java.lang.Override
public void onContactDeleted(java.lang.String username) {
    if (friend_list.contains(username))
        friend_list.remove(username);
    
    adapter.notifyDataSetChanged();
}