public void PrintAllStats() {
    java.lang.System.out.println();
    for (int i = 0; i < (playerList.size()); i++) {
        playerList.get(i).ViewCurrentStats();
    }
    java.lang.System.out.println();
}