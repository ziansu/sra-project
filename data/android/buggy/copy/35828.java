public static com.giisoo.framework.common.Beans<com.giisoo.framework.common.OpLog> load(com.mongodb.BasicDBObject query, int offset, int limit) {
    return com.giisoo.framework.common.OpLog.load(query, new com.mongodb.BasicDBObject().append("created", 1), offset, limit);
}