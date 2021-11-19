public org.apache.catalina.tribes.Member[] getMembers() {
    if (hasMembers()) {
        return members;
    }else {
        return org.apache.catalina.tribes.membership.Membership.EMPTY_MEMBERS;
    }
}