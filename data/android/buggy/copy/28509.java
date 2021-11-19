public void deleteGroupOwned(com.moodmapper.entity.GroupEntity group) {
    if (getGroupsOwned().contains(group)) {
        this.groupsOwned.remove(group);
    }
}