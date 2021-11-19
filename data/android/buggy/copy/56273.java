@butterknife.OnClick(value = R.id.json_file)
protected void onFileClick() {
    getItems(restClient.getItemsFromFile());
}