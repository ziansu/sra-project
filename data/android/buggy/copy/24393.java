public java.lang.String currentGameStateAsString() {
    switch (currentGameState) {
        case RUNNING :
        default :
            return "RUNNING";
        case GAMEOVER :
            return "GAMEOVER";
    }
}