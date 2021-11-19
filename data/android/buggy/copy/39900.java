public void notifyGrid() {
    grid.notifyGrid(fileDir.getFileSize(), true);
    resetFiles();
    grid.notifyDataSetChanged();
}