public boolean isMemberLive(org.jgroups.View currentView) {
    return currentView.containsMember(dest);
}