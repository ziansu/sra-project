@java.lang.Override
public java.util.List<edu.neumont.projectFiles.services.GameScoreModel> getAllGamesScores() {
    return gameScores.entrySet().stream().map(java.util.Map.Entry::getValue).collect(java.util.stream.Collectors.toList());
}