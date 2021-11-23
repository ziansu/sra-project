public skyra.osceleton.Joint get(java.lang.String name) {
    skyra.osceleton.Joint j = mJoints.get(name);
    if (j == null) {
        j = new skyra.osceleton.Joint(myParent);
        mJoints.put(name, j);
    }
    return j;
}