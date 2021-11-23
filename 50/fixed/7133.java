private void setCurrentSide(com.dmitryvoronko.model.game.Side side) {
    switch (side) {
        case X :
            setSelected(sideX, sideO);
            break;
        case O :
            setSelected(sideO, sideX);
            break;
    }
}