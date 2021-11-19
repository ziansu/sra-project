public java.util.HashMap<java.lang.Integer, java.lang.Integer> getOccupiedCells() {
    synchronized(this.lock) {
        return occupiedCells;
    }
}