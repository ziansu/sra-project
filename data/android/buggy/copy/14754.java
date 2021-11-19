@org.junit.Test
public void test_Storage_Content() {
    mStorage.setDataFileLocation(dummyFilePath);
    mStorage.load();
    java.util.ArrayList<pista.logic.Task> mList = mStorage.getTaskList();
    assertEquals("Assume task list size", 1, mList.size());
}