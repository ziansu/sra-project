private void addEnclosingMethodIfAvailable() {
    if ((currentCtx) != null) {
        events.add(cc.kave.commons.model.episodes.Events.newContext(currentCtx));
        currentCtx = null;
    }
}