protected void removeActionIfFinished(pool.action.Action action) {
    if (action.isFinished()) {
        this.actions.remove(action);
    }
}