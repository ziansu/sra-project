public void deleteAction(long actionId) {
    delete(com.github.eyce9000.iem.api.impl.Paths.action(actionId));
}