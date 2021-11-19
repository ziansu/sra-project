public void setOccupant(java.lang.Character occupant) {
    if (walkable()) {
        this.occupant = occupant;
    }else
        throw new artGame.game.GameError("Trying to move character to invalid tile");
    
}