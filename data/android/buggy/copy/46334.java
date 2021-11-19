@java.lang.Override
public void setSelectedEntity(java.util.List<org.sagebionetworks.repo.model.Reference> selected) {
    synAlert.clear();
    if ((selected.size()) > 0) {
        selectedEntity.clear();
        selectedEntity.addAll(selected);
    }
}