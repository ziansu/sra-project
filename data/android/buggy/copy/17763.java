@org.junit.BeforeClass
public static void setUpBeforeClass() throws java.lang.Exception {
    java.lang.System.out.println("criar antes");
    org.roda.rodain.source.ui.FileExplorerPaneTest.testDir = org.roda.rodain.testing.Utils.createFolderStructure();
}