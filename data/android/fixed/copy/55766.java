private void addRow() {
    ui.pointListView.PointListView pointListView = new ui.pointListView.PointListView(this);
    pointListPanel.add(pointListView);
    pointListView.setVisible(true);
    pointListViews.add(pointListView);
}