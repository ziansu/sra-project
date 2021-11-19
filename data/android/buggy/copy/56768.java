public void trash() {
    if (((highLighted) != null) && (!(highLighted.isActive()))) {
        deselectHighlighted();
        highLighted = null;
    }else {
        sellBoardObject(highLighted, true);
    }
}