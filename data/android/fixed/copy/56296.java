public static void addScore(int i) {
    if ((com.titanicrun.game.TitanicClass.gpgs) != null) {
        com.titanicrun.game.TitanicClass.gpgs.submitScore(i);
    }
}