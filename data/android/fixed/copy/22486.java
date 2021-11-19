private int positionToCell(final pacmandemo.world.Position pos) {
    return ((pos.getRow()) * 3) + (pos.getColumn());
}