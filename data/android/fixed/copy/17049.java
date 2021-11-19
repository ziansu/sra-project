@java.lang.Override
protected RequestDataUtil.ResponseObject doInBackground(java.lang.String... params) {
    java.lang.String reqData = null;
    java.lang.String inviteCode = params[0];
    return org.cm.podd.report.util.RequestDataUtil.get(("/users/register/group/code/?invitationCode=" + inviteCode), reqData, null);
}