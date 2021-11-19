public boolean isForeignKey() {
    if (!(this.relationshipList.isEmpty())) {
        return true;
    }
    return false;
}