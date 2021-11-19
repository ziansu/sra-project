public static void incrementTurn() {
    if ((Configurations.round) == 0) {
        util.buyTurnIncre();
    }else {
        util.movePhaseTurnIncre();
    }
}