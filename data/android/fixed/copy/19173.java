public de.slackspace.openkeepass.domain.zipper.GroupZipper replace(de.slackspace.openkeepass.domain.Group group) {
    if ((parent) == null) {
        node = group;
    }else {
        parent.getNode().getGroups().set(index, group);
    }
    return this;
}