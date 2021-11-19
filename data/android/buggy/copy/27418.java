@java.lang.Override
public void onReceived(com.stxnext.intranet2.backend.model.team.Team team) {
    long[] userIdsLong = team.getUsers();
    userIds = com.google.common.primitives.Longs.asList(userIdsLong);
    getUsers(userIds);
}