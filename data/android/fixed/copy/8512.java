public static boolean judge_voted(long UID, long AID) {
    return (zxl.redis.Cluster.jc.zrank(("voted:" + UID), java.lang.String.valueOf(AID))) == null ? false : true;
}