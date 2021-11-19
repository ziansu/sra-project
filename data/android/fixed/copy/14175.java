public org.binu.hypersonic.board.CellItem getItemType() {
    if ((param1) == 1)
        return org.binu.hypersonic.board.CellItem.BONUS_RANGE;
    
    if ((param1) == 2)
        return org.binu.hypersonic.board.CellItem.BONUS_BOMBS;
    
    assert false : "They said there would be items!";
    return null;
}