@java.lang.Override
public java.util.List<java.lang.String> queryLatestImgs(long userId) {
    java.lang.String sql = "SELECT B.Url FROM SG_Feed A INNER JOIN SG_FeedImg B ON A.Id=B.FeedId WHERE A.UserId=? AND A.Status=1 AND B.Status=1 ORDER BY B.AddTime DESC LIMIT 4";
    return queryObjectList(sql, new java.lang.Object[]{ userId }, java.lang.String.class);
}