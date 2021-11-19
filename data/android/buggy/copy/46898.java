public void setExceptional(boolean isExceptional) {
    for (Contract.Behavior b : getLeafs(currentBehavior)) {
        currentBehavior.setExceptional(isExceptional);
    }
}