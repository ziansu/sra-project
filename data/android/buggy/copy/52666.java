public void allComputersTakeAction() {
    java.util.ArrayList<scripts.Player> computers = getActiveComputers();
    for (scripts.Player computer : computers) {
        computer.takeAction();
        getRound().moveOn();
    }
}