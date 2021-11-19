public void removeGroup() {
    int index = groupsListView.getSelectionModel().getSelectedIndex();
    service.StudentGroupService.delete(allGroups.get(index));
    groupsListView.getItems().remove(index);
}