public void updateEntity() {
    if (canBeDouble) {
        findAdjacentTank();
        markDirty();
    }
}