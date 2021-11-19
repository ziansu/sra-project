public void open() {
    Futility.game.player.getCurrentRoom().addItems(matches);
    futility.Output.revealByLetterln(("\n you\'ve opened the matchbox, now there are " + "matches all over the floor."));
}