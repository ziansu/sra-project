@java.lang.Override
public void perform(javelin.view.screen.WorldScreen screen) {
    if (!(World.scenario.minigames)) {
        javelin.Javelin.message("Mini-games are not available on scenario mode.", false);
        throw new javelin.controller.exception.RepeatTurn();
    }
}