private void saveGame() {
    src.SavedGame saveGame = new src.SavedGame("save.dave");
    saveGame.saveGame(this.getMapRelation().getMap());
}