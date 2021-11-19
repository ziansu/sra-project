private boolean isCatsGame() {
    for (Space space : spaces) {
        if (space.isEmpty())
            return false;
        
    }
    return true;
}