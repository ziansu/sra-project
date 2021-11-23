public void loadNar(java.nio.file.Path path) throws java.io.IOException {
    nak.nakloidGUI.coredata.CoreData.decompressNar(path);
    reloadScoreAndPitches();
    pathNar = path;
    NakloidGUI.preferenceStore.setValue("workspace.path_nar", path.toString());
    isSaved(true);
}