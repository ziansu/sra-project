public boolean isPublishChecked() {
    publishChecked = ((service) != null) && ((service.getPublished()) != 0);
    return publishChecked;
}