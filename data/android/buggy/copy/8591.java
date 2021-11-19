@java.lang.Override
public void changeRound() {
    try {
        rmiClientInterface.isYourTurn();
    } catch (java.rmi.RemoteException e) {
        e.printStackTrace();
        user.setConnected(false);
        user.getGameController().onFinishRound(user);
    }
}