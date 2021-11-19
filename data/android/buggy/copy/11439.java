public static java.lang.String deleteGroup(java.lang.Long surveyId, java.lang.Long groupId) {
    java.lang.String groupUrl = helpers.GroupHelper.getDeleteGroupUrl(surveyId, groupId);
    java.lang.System.out.println(("groupUrl:" + groupUrl));
    return sendDelete(groupUrl, 200).getResponse();
}