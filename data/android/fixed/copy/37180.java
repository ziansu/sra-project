public sandbox.ActionHistory getLastActionHistory() {
    if (this.actionHistory.isEmpty()) {
        return null;
    }
    return this.actionHistory.get(((this.actionHistory.size()) - 1));
}