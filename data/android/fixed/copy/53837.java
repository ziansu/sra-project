public void placeStartLake(hf.game.items.LakeTile lake, int id) {
    java.lang.System.out.println("place start lake.");
    lake.flipFaceUp();
    entities.get(id).setLake(lake);
    giveLanternCard();
}