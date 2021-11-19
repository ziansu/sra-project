public void tick() {
    if ((timer.getTime()) == 0) {
        game.state = Game.STATE.LOSE;
    }
}