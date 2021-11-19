@java.lang.Override
public void setSelectedEntity(org.sagebionetworks.repo.model.Reference selected) {
    synAlert.clear();
    selectedEntity.clear();
    selectedEntity.add(selected);
}