@java.lang.Override
public void update(de.htwg.monopoly.util.GameStatus status) {
    if (status == (de.htwg.monopoly.util.GameStatus.STARTED)) {
        gui.startGame();
        setVisible(false);
    }
}