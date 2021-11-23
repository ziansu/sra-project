@java.lang.Override
public int getItemCount() {
    int count = super.getItemCount();
    if (count == 0)
        return count;
    
    return count + 1;
}