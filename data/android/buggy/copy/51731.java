private final void addCritterToSpace() {
    int index = this.convertCoordToIndex();
    java.util.List<assignment4.Critter> space = assignment4.Critter.worldLists.get(index);
    space.add(this);
}