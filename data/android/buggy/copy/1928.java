@java.lang.Override
public void update(final java.util.Observable o, final java.lang.Object arg) {
    cOnGoingStroll = ((boolean) (arg));
    cg.group4.view.screen_mechanics.ScreenStore.getInstance().addScreen("Stroll", new cg.group4.view.screen.StrollScreen());
}