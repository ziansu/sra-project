@java.lang.Override
public int getItemCount() {
    if ((data) == null)
        return 1;
    
    return data.size();
}