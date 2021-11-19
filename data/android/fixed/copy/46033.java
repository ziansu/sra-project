@java.lang.Override
public int getItemCount() {
    if ((headerView) != 0)
        return (items.size()) + 1;
    else
        return items.size();
    
}