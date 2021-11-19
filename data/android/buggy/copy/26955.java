public static com.google.gson.JsonObject minimaxDecision(net.etfbl.connectfour.GameBoard currentBoardState, net.etfbl.connectfour.Game.Player currentPlayer) {
    java.lang.System.out.println("MINIMAXIS");
    return net.etfbl.connectfour.algorithms.Minimax.getRandomMove(currentBoardState);
}