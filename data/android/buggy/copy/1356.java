public java.util.List<io.clubhub.client.Club> getClubList(java.lang.String region) {
    mDynamoDBHelper.updateClubData(mClubMap, region);
    return new java.util.ArrayList(mClubMap.values());
}