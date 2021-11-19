private static void showScores() {
    me.peterg.Main.players.entrySet();
    for (me.peterg.Player player : me.peterg.Main.players.values()) {
        java.lang.System.out.println(player.generateScore());
    }
}