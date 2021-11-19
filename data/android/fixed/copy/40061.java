@org.junit.Test
public void selectTask_emptyList() {
    commandBox.runCommand("clear");
    assertSelectionInvalid(1);
    assertListSize(0);
}