public void drop() {
    game.items.Item item = items[selected].item;
    if (item == null)
        return ;
    
    addItem(null, selected);
    level.addItem(item, x, y);
}