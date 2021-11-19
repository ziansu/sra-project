private boolean isCatsGame() {
    boolean returnValue = false;
    for (Space space : spaces) {
        if (space.isEmpty())
            return true;
        
    }
    return false;
}