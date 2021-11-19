public boolean modifyItemName(java.util.UUID itemId, java.lang.String string) {
    if ((string.length()) == 0)
        return false;
    
    menu.setItemName(itemId, string);
    return true;
}