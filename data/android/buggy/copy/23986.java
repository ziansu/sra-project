public com.zimbra.soap.type.WaitSetAddSpec setFolderInterests(java.util.Collection<java.lang.Integer> folderIds) {
    this.folderInterests.clear();
    this.folderInterests.addAll(folderIds);
    return this;
}