private com.ygl.piggynote.controller.StatData queryAndStatUserData(java.lang.String userName) {
    com.ygl.piggynote.controller.StatData sd = new com.ygl.piggynote.controller.StatData();
    queryAndStatCurMonthData(userName, sd);
    queryAndStatMonthsData(userName, sd);
    queryAndStatPrepayData(userName, sd);
    return sd;
}