@org.junit.Test
public void modifyDisk_chooseDisk() {
    setFieldNameInModel(jetbrains.mps.ide.vcs.test.merge.DiskMemoryConflictsTest.FIELD_NAME_IN_MODEL);
    setFieldNameInFile(jetbrains.mps.ide.vcs.test.merge.DiskMemoryConflictsTest.FIELD_NAME_IN_FILE);
    myMockDialog.waitForShow(0);
    refreshVfs();
    org.junit.Assert.assertTrue(myMockDialog.wasExecuted());
    checkSynchronizedState(jetbrains.mps.ide.vcs.test.merge.DiskMemoryConflictsTest.FIELD_NAME_IN_FILE);
}