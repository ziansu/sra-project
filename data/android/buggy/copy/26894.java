private void AnalyzeGameStates(java.lang.String line) {
    gameState.parse(line);
    alterKeyCombination(laserLocation, gameState.getPlayerLocation(), gameState.getPlayerAngel());
}