public java.lang.String currentGameStateAsString() {
    switch (currentGameState) {
        case RUNNING :
            return "RUNNING";
        case GAMEOVER :
            return "GAMEOVER";
        default :
            return "RUNNING";
    }
}