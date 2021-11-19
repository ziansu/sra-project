@java.lang.Override
public java.lang.Object getItem(int position) {
    if ((contactList) == null)
        return 0;
    
    return contactList.get(position);
}