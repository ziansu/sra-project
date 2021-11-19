private void deleteTestData(teaselib.test.TestScript script, java.lang.String path) throws java.io.IOException {
    java.io.File res1 = script.resources.unpackEnclosingFolder(path);
    deleteFolder(res1.getParentFile());
    assertFalse(res1.exists());
}