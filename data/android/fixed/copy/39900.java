public void notifyGrid() {
    grid.notifyGrid(fileDir, true);
    resetFiles();
    grid.notifyDataSetChanged();
}