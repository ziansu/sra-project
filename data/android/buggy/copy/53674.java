@java.lang.Override
public void onDropped() {
    if (((gameController.getBoard().isReplay()) == false) && ((currentGame) != null))
        currentGame.addAction("KS");
    
}