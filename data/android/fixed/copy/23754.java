@java.lang.Override
public void startJoinGame(client.join.GameInfo game) {
    stopTimer();
    getJoinGameView().closeModal();
    getSelectColorView().showModal();
    state.setGame(game);
}