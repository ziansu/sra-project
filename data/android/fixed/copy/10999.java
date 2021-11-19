@org.junit.Test
public void clearByCategory_existingCategoryWithShortcut() {
    java.lang.String categoryDetails = "c/friends";
    seedu.taskboss.testutil.TestTask[] expectedTaskList = new seedu.taskboss.testutil.TestTask[]{ td.carl , td.elle , td.daniel , td.george , td.fiona };
    boolean isShortedCommand = true;
    assertClearSuccess(isShortedCommand, categoryDetails, expectedTaskList);
}