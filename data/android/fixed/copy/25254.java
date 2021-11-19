public static java.lang.String getName(spark.Request req) {
    if (!(app.util.RequestUtil.cache.containsKey(req)))
        app.util.RequestUtil.cache.put(req, app.util.RequestUtil.body(req));
    
    return app.util.RequestUtil.cache.get(req).get("name");
}