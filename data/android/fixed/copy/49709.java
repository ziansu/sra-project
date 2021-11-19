public java.util.Map<org.magic.api.beans.MagicCard, java.lang.Integer> getSelectedMap() {
    if ((selectedIndex) == 0)
        return deck.getMap();
    else
        return deck.getMapSideBoard();
    
}