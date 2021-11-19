public boolean isClueAnsweredBy(final com.jam.jampardy.model.GameBoard.Contestant contestant, final com.jam.jampardy.model.Clue clue) {
    return (answeredClueMap.get(clue)) == contestant;
}