public void refreshListView() {
    listView.getItems().clear();
    java.lang.System.out.println(scaleItems);
    listView.getItems().addAll(scaleItems);
}