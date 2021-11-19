public void updateFolder(com.mcnedward.museum.model.Directory folder) {
    updateText();
    setImage(folder.getThumbnail());
    folder.setFolderCard(this);
}