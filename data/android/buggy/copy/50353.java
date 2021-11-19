public void retractMembership(final java.util.UUID pId) {
    session.retract(session.getFactHandle(getMemberOf(pId)));
}