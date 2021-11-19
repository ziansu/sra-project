public static void incrementTurn() {
    java.lang.System.out.println(Configurations.round);
    if ((Configurations.round) == 0) {
        util.buyTurnIncre();
    }else {
        util.movePhaseTurnIncre();
    }
}