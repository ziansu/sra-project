public void drop() {
    game.items.Item item = items[selected];
    if (item == null)
        return ;
    
    items[selected] = null;
    level.addItem(item, x, y);
}