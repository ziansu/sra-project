public void startChallenge(java.util.List<com.tigerzone.fall2016server.tournament.tournamentplayer.TournamentPlayer> tournamentPlayers) {
    com.tigerzone.fall2016server.server.Logger.initializeLogger(com.tigerzone.fall2016server.server.TournamentServer.tournamentID);
    challenge = new com.tigerzone.fall2016server.tournament.Challenge(this, 123, tournamentPlayers);
    challenge.beginChallenge();
}