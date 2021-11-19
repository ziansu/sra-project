public void update(net.osmand.plus.download.DownloadResourceGroup mainGroup) {
    this.mainGroup = mainGroup;
    data = mainGroup.getGroups();
    notifyDataSetChanged();
}