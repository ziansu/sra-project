private void updateRedoStack(seedu.malitio.model.history.InputHistory history) {
    model.getFuture().push(history);
}