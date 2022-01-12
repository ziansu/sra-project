public synchronized java.util.ArrayList<main.objects.User> getUsersNotInGroup(main.objects.Group group) {
    if (group == null) {
        return null;
    }
    return getUsersNotInGroup(group.getID());
}