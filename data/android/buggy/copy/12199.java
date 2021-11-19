public boolean removeAll() {
    open();
    int result = database.delete(com.michael.database.CookieTable.TABLE, "1", null);
    close();
    if (result > 0)
        return true;
    else
        return false;
    
}