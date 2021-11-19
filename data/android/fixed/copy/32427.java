@org.junit.Test
public void loadNewFile() throws java.lang.Exception {
    java.lang.String filePath = getTempFilePath("newfile.xml");
    commandBox.runCommand(("load new " + filePath));
    org.junit.Assert.assertTrue(project.taskcrusher.commons.util.FileUtil.isFileExists(new java.io.File(filePath)));
}