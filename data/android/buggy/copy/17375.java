public player.item.Item find(java.lang.String itemStr) {
    for (player.item.Item item : items) {
        if (item.name.equals(itemStr))
            return item;
        
    }
    return null;
}