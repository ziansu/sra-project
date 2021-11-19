public void play() {
    while (!(this.isGameOver())) {
        do {
            Position position = this.player.askForTile();
        } while ($missing$ );
    } 
}