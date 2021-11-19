private void hideItem(android.view.Menu menu, int itemId) {
    if ((menu.findItem(itemId)) != null)
        menu.findItem(itemId).setVisible(false);
    
}