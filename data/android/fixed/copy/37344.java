public void removeAt(int position) {
    if ((position < 0) || (position >= (list.size())))
        return ;
    
    list.remove(position);
    notifyItemRemoved(position);
}