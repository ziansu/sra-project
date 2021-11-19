private void updateFilteredTaskList(seedu.address.model.ModelManager.Expression expression) {
    filteredTaskComponents.setPredicate(expression::satisfies);
}