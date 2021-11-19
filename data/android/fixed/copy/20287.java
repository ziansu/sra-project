protected boolean removeActionIfFinished(pool.action.Action action) {
    if (action.isFinished()) {
        return this.actions.remove(action);
    }
    return false;
}