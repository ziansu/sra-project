@org.junit.Test
public void edit_invalidValues_failure() {
    commandBox.runCommand("edit 1 n/*&");
    assertResultMessage(Name.MESSAGE_NAME_CONSTRAINTS);
    commandBox.runCommand("edit 1 p/abcd");
    assertResultMessage(PriorityLevel.MESSAGE_PRIORITY_CONSTRAINTS);
    commandBox.runCommand("edit 1 c/*&");
    assertResultMessage(Category.MESSAGE_CATEGORY_CONSTRAINTS);
}