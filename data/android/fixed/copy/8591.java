@java.lang.Override
public void changeRound() {
    try {
        rmiClientInterface.isYourTurn();
    } catch (java.rmi.RemoteException e) {
        user.setConnected(false);
        user.getGameController().onFinishRound(user);
    }
}