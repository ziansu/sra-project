private boolean isCutOff(chesspresso.position.Position position, int currentDepth, int maxDepth) {
    if (position.isTerminal()) {
        return true;
    }else
        if (currentDepth > maxDepth) {
            return true;
        }else {
            return false;
        }
    
}