public void tick(game.Game game) {
    if (Game.key.left) {
        x += 5;
        java.lang.System.out.println(x);
        return ;
    }
    if (Game.key.right) {
        x -= 5;
        return ;
    }
}