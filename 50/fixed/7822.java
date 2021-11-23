private void startGame() {
    if ((game.getState()) == (es.ucm.fdi.tp.basecode.bgame.model.Game.State.Starting))
        super.start();
    else
        restart();
    
}