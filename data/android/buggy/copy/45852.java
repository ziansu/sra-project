@java.lang.Override
public void setSelectedEntity(org.sagebionetworks.repo.model.Reference selected) {
    synAlert.clear();
    if (selectedEntity.isEmpty()) {
        selectedEntity.add(selected);
    }
    selectedEntity.set(0, selected);
}