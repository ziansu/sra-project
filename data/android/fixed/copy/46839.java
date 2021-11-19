public javax.media.j3d.BranchGroup getGroup() {
    if ((group) == null) {
        group = makeShape(model);
    }
    return group;
}