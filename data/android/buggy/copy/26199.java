public void clear() {
    if (((data) == null) || ((data.size()) == 0))
        return ;
    
    data.clear();
    notifyAllDataChanged();
}