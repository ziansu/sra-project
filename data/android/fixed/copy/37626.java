private void addToFolderpaths(java.nio.file.Path folder) {
    folderPaths.add(renameFolder(folder.toString()));
    java.util.Collections.sort(folderPaths);
}