public void clean() {
    externalIdentifiersJson = null;
    url = null;
    type = null;
    completionDate = null;
    visibility = null;
    if ((subject) != null) {
        subject.clean();
    }
}