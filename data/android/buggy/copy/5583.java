@java.lang.Override
public void run() {
    ClientTicTacToe.mainController.setRemotePlayer(remotePlayer);
    ClientTicTacToe.mainController.setDisable_Enable_MainView(false);
    ClientTicTacToe.mainController.setDisable_Enable_ListView(true);
    ClientTicTacToe.mainController.setDisable_Enable_ChatView(false);
}