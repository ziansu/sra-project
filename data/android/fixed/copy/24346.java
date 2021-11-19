private void hideItem(android.view.Menu menu, int itemId) {
    if ((menu != null) && ((menu.findItem(itemId)) != null))
        menu.findItem(itemId).setVisible(false);
    
}