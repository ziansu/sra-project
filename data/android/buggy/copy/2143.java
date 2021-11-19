public static boolean compareCardAndTask(guitests.guihandles.TaskCardHandle card, seedu.address.testutil.ReadOnlyTask task) {
    return card.isSameTask(task);
}