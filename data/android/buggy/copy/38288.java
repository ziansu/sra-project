public static tilitoli.Scores GetScores() {
    synchronized(tilitoli.NetworkClient.scores) {
        return tilitoli.NetworkClient.scores;
    }
}