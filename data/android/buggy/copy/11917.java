public void move(Direction d) {
    Cell target = position.getNeighbor(d);
    if (target != null)
        target.action(this, position);
    
}