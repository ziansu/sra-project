@java.lang.Override
public void enter(woohoo.screens.PlayingScreen screen) {
    screen.getEngine().getSystem(woohoo.gameworld.ContactSystem.class).setProcessing(false);
}