public int getItemCount() {
    if ((getRealmAdapter()) != null) {
        int size = getRealmAdapter().getCount();
        return size;
    }
    return 0;
}