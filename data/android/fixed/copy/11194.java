public void launch(uk.dangrew.gnocchi.game.Game game) {
    this.game = game;
    this.stack.stack(new uk.dangrew.gnocchi.framework.GameAction(new uk.dangrew.gnocchi.framework.action.FillAction(game), new uk.dangrew.gnocchi.framework.animation.GravityAnimation(game)));
}