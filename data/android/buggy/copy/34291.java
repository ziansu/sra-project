@org.junit.Test
public void execute_find_onlyMatchesFullWordsInNamesAndNotCaseSensitive() throws java.lang.Exception {
    java.util.List<t09b1.today.model.task.Task> expectedList = java.util.Arrays.asList(td.completedListEvent);
    assertCommandSuccess("find go", t09b1.today.logic.commands.Command.getMessageForTaskListShownSummary(expectedList.size()), expectedAB, expectedList);
}