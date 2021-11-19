public static double playOneGeneratedLevel(java.lang.String gameFile, java.lang.String actionFile, java.lang.String levelFile, int randomSeed) {
    java.lang.String agentName = "controllers.human.Agent";
    boolean visuals = true;
    return core.ArcadeMachine.runOneGeneratedLevel(gameFile, visuals, agentName, actionFile, levelFile, randomSeed);
}