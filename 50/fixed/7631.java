public boolean removeItem(com.mojang.ld22.item.Item i) {
    com.mojang.ld22.item.Item item = findItem(i);
    if (item == null)
        return false;
    else
        items.remove(item);
    
    return true;
}